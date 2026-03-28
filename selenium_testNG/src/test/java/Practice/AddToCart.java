package Practice;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class AddToCart extends DemoBaseClass {
	@Test(priority=1)

	public void logIn() {



		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

        //verification

		WebElement swagLabs = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

		if (swagLabs.getText().contains("Swag Labs")) {

		Reporter.log("Login success",true);

		} else {

			Reporter.log("Login failed",true);

		}

	}



	@Test(priority=7)

	public void addtoCart() {

		// Adding to cart

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		// verifying

		driver.findElement(By.id("shopping_cart_container")).click();

		List<WebElement> productsInTheCart = driver.findElements(By.cssSelector("[class='cart_item']"));

		String result=" ";

		for (WebElement cartItem : productsInTheCart) {

			result+=cartItem.getText();

		}

		if(result.contains("Sauce Labs Bike Light")&& result.contains("Sauce Labs Backpack")) {

			Reporter.log("Status: Pass",true);

		}

		else {

			Reporter.log("Status: Fail",true);

		}

	}

	@Test(priority=9, dependsOnMethods ="logIn" )

	public void logout() {

		

	}

}
