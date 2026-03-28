package Weekly_practice_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class swag_2 {
	WebDriver driver = null;
	@Test(priority = -1)
	public void Login() {
		//login
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");

        driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
	}
	@Test(priority = 0,dependsOnMethods = "Login")
	public void sort() {
		//sorting based on price
		WebElement element =driver.findElement(By.cssSelector("[class='product_sort_container']"));
		element.click();
		element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element.click();	
	}
	@Test(priority=1,dependsOnMethods = "sort")

	public void addtoCart() {

		// Adding to cart

		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

	}
	@Test(priority=2,dependsOnMethods = "addtoCart")
		public void verifyingcart() {
			//verifying the product in cart
			driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
			String val = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
			String original = "Sauce Labs Onesie";
			SoftAssert sa= new SoftAssert();
			 sa.assertEquals(original, val);
		        if(val.equals(original)) {
		        	System.out.println("Verified");
		        }
		        else {
		        	System.out.println("not verified");
		        }
		}
	@Test(priority=3,dependsOnMethods = "verifyingcart")
	public void checkout() {
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Keerthi");
		driver.findElement(By.id("last-name")).sendKeys("p");
		driver.findElement(By.id("postal-code")).sendKeys("600116");
		driver.findElement(By.id("continue")).click();
	}
	@Test(priority=4,dependsOnMethods = "checkout")
	public void ordersummery() {
		WebElement price = driver.findElement(By.className("inventory_item_price"));
		double total = 0;
			String cleaned = price.getText().replace("$", "");
			double num = Double.parseDouble(cleaned);
			total = total + num;		
		total += 0.64;
		//Validate
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(total, 8.63);
		if(8.63==(total)) {
        	System.out.println("Verified");
        }
        else {
        	System.out.println("not verified");
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
