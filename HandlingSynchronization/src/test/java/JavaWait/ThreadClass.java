package JavaWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//sleep(long millis)
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(1500, 100);
	    driver.navigate().to("https://www.shoppersstack.com/");
	    //sleep(duration duration)
	    Thread.sleep(Duration.ofSeconds(5));

	}

}
