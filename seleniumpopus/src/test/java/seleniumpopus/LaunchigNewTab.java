package seleniumpopus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchigNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//Triggering a new tab in the same browser window and parallely switching the control 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/");

	}

}
