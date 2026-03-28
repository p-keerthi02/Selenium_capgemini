package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrangeHRM_Recruitment_Add_Vacancy {
	WebDriver driver = null;

	@Test(priority = -1)
	public void LaunchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 1, dependsOnMethods = "LaunchingBrowser")
	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		// Verify Login
		WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
		if (Login_Verify.isDisplayed()) {
			Reporter.log("Login Page Status : Passed", true);
		} else {
			Reporter.log("Login Page Status : Failed", true);
		}
	}

	@Test(priority = 3, dependsOnMethods = "Login")
	public void AddVacancy() throws InterruptedException {
		// Click on recruitment then vacancy and add the user
		driver.findElement(By.xpath("//span[. = 'Recruitment']")).click();
		driver.findElement(By.xpath("//a[ . = 'Vacancies']")).click();
		driver.findElement(By.xpath("//button[contains(. , ' Add')]")).click();
		
		//Enter vacancy name
		driver.findElement(By.xpath("//label[. = 'Vacancy Name']/../..//input")).sendKeys("Automation TE");
		//Select Job title, description
		driver.findElement(By.xpath("//label[. = 'Job Title']/../..//div[@class = 'oxd-select-text--after']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[. = 'Automaton Tester']")).click();
		
		driver.findElement(By.tagName("textarea")).sendKeys("Seeking for Empoloyee who is expert in Automation Test");
		
		//Select Hiring manager
		WebElement Hiring_Manager = driver.findElement(By.xpath("//input[@placeholder= 'Type for hints...']"));
		Hiring_Manager.sendKeys("A");
		Thread.sleep(2000);
		Hiring_Manager.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		//No. Of Positions
		driver.findElement(By.xpath("//label[. ='Number of Positions']/../..//input")).sendKeys("3");
		
		//Save
		driver.findElement(By.xpath("//button[@type = 'submit']"));
	}
	
	@Test(priority = 5, dependsOnMethods = "Login")
	public void LogOut() {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Verify LogOut
		WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
		if(Logout.isDisplayed()) {
			Reporter.log("LogOut status : Passed", true);
		} else {
			Reporter.log("LogOut status : Failed", true);
		}
	}
}
