package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SaucelabAddToCartTest {

    WebDriver driver;

    @Test(priority=-1)
    public void launchingBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(priority=0)
    public void login() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Verification
        WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        if (swagLabsText.getText().contains("Swag Labs")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    @Test(priority=1)
    public void addtocart() {

        // Adding to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.id("shopping_cart_container")).click();

        // Verification
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));

        if (product1.isDisplayed() && product2.isDisplayed()) {
            System.out.println("Both products added successfully");
        } else {
            System.out.println("Products not added");
        }
    }
    @Test(priority=2)
    public void logout() {
    	driver.findElement(By.id("react-burger-menu-btn")).click();
    	driver.findElement(By.cssSelector("[id='logout_sidebar_link']")).click();
    }
}