package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmHardAssert {
	WebDriver driver = null;

	@Test
	public void login() throws InterruptedException {
		// launching the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigating to orange hrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// login using valid credentials
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		//verifying login
		WebElement orangehrmlogo = driver.findElement(By.xpath("//a[@class='oxd-brand']"));
		boolean verifyinglogo = orangehrmlogo.isDisplayed();
		//hard assert
		Assert.assertEquals(verifyinglogo,true);
	}
}