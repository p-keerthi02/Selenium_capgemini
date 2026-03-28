package Weekly_practice_test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class swag_1 {
	WebDriver driver = null;
	@Test(priority = -1)
	public void Login() {
		//login
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");

        driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
	}
	@Test(priority=0,dependsOnMethods = "Login")
	public void validate() {
		//login validation
		WebElement swagLabs = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

		if (swagLabs.getText().contains("Swag Labs")) {

		System.out.println("login successful");;

		} else {

			System.out.println("Login failed");

		}

	}
	@Test(priority=1,dependsOnMethods = "validate")

	public void addtoCart() {

		// Adding to cart

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	}

	@Test(priority=2,dependsOnMethods = "addtoCart")
		public void verifyingCart() {
		//verifying the cart

				driver.findElement(By.id("shopping_cart_container")).click();

				List<WebElement> productsInTheCart = driver.findElements(By.cssSelector("[class='cart_item']"));

				String result=" ";

				for (WebElement cartItem : productsInTheCart) {

					result+=cartItem.getText();

				}
				
				if(result.contains("Sauce Labs Bike Light")&& result.contains("Sauce Labs Backpack")) {

					System.out.println("bike light and labs backpack is added");;

				}

				else {

					System.out.println("cart is empty");;

				}
				
	}

		@Test(priority=3,dependsOnMethods = "verifyingCart")
		public void checkout() {
			//checking out
			driver.findElement(By.id("checkout")).click();
			driver.findElement(By.id("first-name")).sendKeys("Keerthi");
			driver.findElement(By.id("last-name")).sendKeys("p");
			driver.findElement(By.id("postal-code")).sendKeys("600116");
			driver.findElement(By.id("continue")).click();
			
		}
		@Test(priority=4,dependsOnMethods = "checkout")
		public void validation() {

				  // validating price order

				        String totalPrice = driver.findElement(By.className("summary_total_label")).getText();
				        String expectedTotalprice="Total: $43.18";
				        SoftAssert sa= new SoftAssert();
				        sa.assertEquals(expectedTotalprice, totalPrice);
				        if(totalPrice.equals(expectedTotalprice)) {
				        	System.out.println("Total price verification:Passed $43.18");
				        }
				        else {
				        	System.out.println("Total price verification:Failed");
				        }

				    }
		@Test(priority=5,dependsOnMethods = "checkout")
		public void logout() {
			//logout
			driver.findElement(By.name("finish")).click();
			driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
}


