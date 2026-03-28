package navigation_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatebackandforth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

	}

}
