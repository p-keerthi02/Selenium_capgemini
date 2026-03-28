package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test3 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://icehrmpro.gamonoid.com/login.php");
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.xpath("//button[@class=\"btn btn-info btn-medium w-100 text-uppercase\" and @type=\"button\"]")).click();
	if(!driver.getCurrentUrl().contains(" Login failed")) {
		System.out.println("dashboard displayed");
	}
	driver.findElement(By.xpath("//span[.='Employees']")).click();
	driver.findElement(By.partialLinkText(" Employees")).click();
	driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
   driver.findElement(By.xpath("//span[.='Select Department']")).click();
 	}

}