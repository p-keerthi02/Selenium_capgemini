package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.linkText("Open In New Tab")).click();
		Set<String> allIds = driver.getWindowHandles();
		allIds.remove(driver.getWindowHandle());
		for(String child : allIds) {
			driver.switchTo().window(child);
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		}
		

	}

}
