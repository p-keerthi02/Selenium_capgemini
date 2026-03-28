package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PIM_link {

	WebDriver driver = null;
	@Test(priority = -1)
	public void Login() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");

        driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	}
	@Test(priority = 1, dependsOnMethods = "Login")
	public void PIM() {
		driver.findElement(By.linkText("PIM")).click();
	}
	@Test(priority = 2, dependsOnMethods = "PIM")
	public void Add() {
		driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']")).click();
	}
	@Test(priority = 3,dependsOnMethods = "Add")
	public void Adduser() {
		driver.findElement(By.cssSelector("[class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("keerthi");
		driver.findElement(By.cssSelector("[class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("Reddy");
		driver.findElement(By.cssSelector("[class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("P");
		WebElement employeeId = driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]"));
		employeeId.sendKeys(Keys.CONTROL+"0418",Keys.BACK_SPACE);
		employeeId.sendKeys("1234");
	}
	@Test(priority = 4,dependsOnMethods = "Adduser")
	public void clickToggle() {
		driver.findElement(By.cssSelector("[class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
	}
	@Test(priority = 5,dependsOnMethods = "clickToggle")
	public void Username() {
		driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("Keerthi");
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("keerthi@2005");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("keerthi@2005");
	}
	@Test(priority=6,dependsOnMethods = "Username")
	public void save() {
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
	@Test(priority=7,dependsOnMethods = "save")
	public void Admin() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	@Test(priority=8,dependsOnMethods = "Admin")
	public void Credentials() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("Keerthi");
		driver.findElement(By.xpath("//label[text()='User Role']/following::div[4]")).sendKeys(Keys.ARROW_DOWN);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		element.sendKeys("a");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		WebElement element2=driver.findElement(By.xpath("//label[text()='Status']/following::div[4]"));
		element2.sendKeys(Keys.ARROW_DOWN);
		element2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

	}
	@Test(priority=9,dependsOnMethods = "Admin")
	public void verification() {
		WebElement element1=driver.findElement(By.xpath("//span[text()='No Records Found']"));
		if(element1.isDisplayed()) {
			System.out.println("No record found");
		}
		else {
			System.out.println("Record found");
		}
}
	@Test(priority=10,dependsOnMethods = "verification")
	public void logout() {
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
