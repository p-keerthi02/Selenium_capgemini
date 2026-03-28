package navigation_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetostring {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//driver.quit();

	}

}
