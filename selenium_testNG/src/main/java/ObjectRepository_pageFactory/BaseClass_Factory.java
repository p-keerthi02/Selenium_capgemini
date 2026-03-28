package ObjectRepository_pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass_Factory {

	public WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
//		option.addArguments("--headless");
		
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
