package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm_Vacancy {
	WebDriver driver = null;

	@Test(priority = -1)
	public void LaunchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority=0,dependsOnMethods = "LaunchingBrowser")
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	}
	@Test(priority=1,dependsOnMethods = "login")
	public void Recruitment() {
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		driver.findElement(By.xpath("//a[text()='Vacancies']")).click();
		WebElement element = driver.findElement(By.xpath("//label[text()='Job Title']/following::div[contains(@class,'oxd-select-text oxd-select-text--active')]"));
		element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element.click();
		
	}
}
