package com.orangehrmselenium.uiframework.GenericUtility;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.Login_Page;

public class BaseClass {
	public WebDriver driver;
	String Browser;
	FileInputStream fis;
	Properties prop;
	FileUtility fiu=new FileUtility();
	WebDriverUtility wdu;;
	Login_Page lp;
	DashboardPage dsp;


	@BeforeSuite
	public void configBeforeSuit() {
		Reporter.log("---Exceuting before Suite---", true);
	}

	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("---Exceuting before Test---", true);
	}
	@Parameters("BROWSER")
	@BeforeClass(groups= {"Rergression","Smoke"})
	public void beforeClass() throws IOException {
		Reporter.log("---Launching Browser---", true);
		fis = new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
		prop=new Properties();
		prop.load(fis);
		Browser=fiu.getPropertyKeyValue("browser");
		if (Browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.contains("firefox")) {
			
			driver = new FirefoxDriver();
		}else if(Browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		
		wdu= new WebDriverUtility(driver);
		lp = new  Login_Page(driver);
		dsp = new DashboardPage(driver);
		
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(20);
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		Reporter.log("---Exceuting before Method---", true);
		String URL =fiu.getPropertyKeyValue("url");
		
		String ValidUserName=fiu.getPropertyKeyValue("username");
		String ValidPassword = fiu.getPropertyKeyValue("password");
		// login
		wdu.navigateToApplication(URL);
		lp.Login(ValidUserName, ValidPassword);
		
	}

//	@Test
//	public void login() {
//	Reporter.log("Executing test",true);
//	}
	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("---Logging Out---", true);
		dsp.logout();
	}

	@AfterClass
	public void configAfterClass() {
		Reporter.log("---Exceuting after Class---", true);
		wdu.closingBrowserWindow();
	}

	@AfterTest
	public void configAfterTest() {
		Reporter.log("---Exceuting after Test---", true);
	}

	@AfterSuite
	public void configAfterSuit() {
		Reporter.log("---Exceuting after Suite---", true);
	}

}

	
	