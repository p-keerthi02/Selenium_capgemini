package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
//	@Test
//	public void testMethod() {
//		String expectedTitle="HRM";
//		String ActualTitle="hrm";
//		//Hard Assertion;
//		Assert.assertEquals(expectedTitle, ActualTitle);
		
//	}
	@Test
	public void testing() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String ActualTitle=driver.getTitle();
		//Hard Assertion
		Assert.assertEquals(ActualTitle, expectedTitle);
//		if(ActualTitle.equals(expectedTitle)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		Assert.assertTrue(expectedTitle.equals(ActualTitle),"Passed");
	}

}
