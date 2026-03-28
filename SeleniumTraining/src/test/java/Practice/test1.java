package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrm-open.gamonoid.com/login.php?next=P2c9YWRtaW4mbj1kYXNoYm9hcmQmbT1hZG1pbl9BZG1pbg");
		//Leaving the username and password 
		// validating the login 
		driver.findElement(By.cssSelector("[onclick='submitLogin();return false;']")).click();
		//providiing invalid credentials
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("Admin",Keys.ENTER);
		//Validate that the application displays invalid credential error message.
				WebElement Alert = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']"));
				if(Alert.isDisplayed()) {
					System.out.println("Alert Status : Login failed");
				} else {
					System.out.println("Alert Status : Login succesful");
				}
		//Giving valid user credentials 
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("admin",Keys.ENTER);
		//Validate that the application displays invalid credential error message.
		WebElement Alert1 = driver.findElement(By.xpath("//header [@id = 'delegationDiv' and @class = 'header']"));
				if(Alert1.isDisplayed()) {
					System.out.println("Alert1 Status : Login successfully");
				} else {
					System.out.println("Alert1 Status : Login Failed");
				}
		//Handling popup
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		//Navigating to employee section
		driver.findElement(By.xpath("//span[text()='Employees']")).click();
		driver.findElement(By.cssSelector("[id='employeeLink']")).click();
		//click on skills
		driver.findElement(By.cssSelector("[id='tabEmployeeSkill']")).click();
		//click on Add new
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		if(driver.getCurrentUrl().contains("https://icehrm-open.gamonoid.com/login.php?logout=1")) {
			System.out.println("login page displayed");
		}
		else {
			System.out.println("login page is not dispplayed");
		}
		//logout
		
		//driver.quit();
	}
	}

	


