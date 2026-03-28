package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args ) throws InterruptedException {
		// TODO Auto-generated method stub
		//step1 Launch the browser
		WebDriver driver= new ChromeDriver();
		//step2 Navigate to webpage 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);

	     driver.findElement(By.name("username")).sendKeys("Admin");

	     driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	     Thread.sleep(3000);

	     WebElement homepage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

	     if(homepage.isDisplayed()) {

			 System.out.println("Login successful");

		}

	     else {

			 System.out.println("Login failed");

		}
	}

}
