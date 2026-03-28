package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/34");
		//writing the pin
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		//locating the check button
		WebElement checkbtn = driver.findElement(By.name("Check"));
		//waiting for the check button to be enabled bwfore clicking
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkbtn));
		//CClicking on check button
		checkbtn.click();
		

	}

}
