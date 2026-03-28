package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrmselenium.uiframework.GenericUtility.ScreenshotUtility;
import com.orangehrmselenium.uiframework.GenericUtility.WebDriverUtility;

import ObjectRepository_pageFactory.LoginPage;

public class CaptureScreenshot {
	@Test(invocationCount=2)

	public void screenShot() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver() ;
		WebDriverUtility wu = new WebDriverUtility(driver);
		LoginPage lp = new LoginPage(driver);
		DashboardPage dsp = new DashboardPage(driver);
		ScreenshotUtility ss = new ScreenshotUtility();
		String timestamp =new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin","admin123");
		Thread.sleep(2000);
		//capture the screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File perm = new File("./Report/dashboard"+timestamp+".png");
//		FileHandler.copy(temp, perm);
		ss.captureScreenshot(driver, "DashboardPage");
		ss.captureScreenshot(dsp.clickRecruitment(),"recruitmentLink");
//		
//	WebElement recruitmentLink = dsp.clickRecruitment();
//	File tempsrc =recruitmentLink.getScreenshotAs(OutputType.FILE);
//	File PermTrg = new File("./Report/Recruitment"+timestamp+".png");
//	
//	FileHandler.copy(tempsrc, PermTrg);
	}
	}

