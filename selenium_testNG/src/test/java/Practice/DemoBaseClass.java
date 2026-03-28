package Practice;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Reporter;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

public class DemoBaseClass {
	WebDriver driver;

	@BeforeSuite

	public void beforeSuite() {

		Reporter.log("Executing Suite",true);

	}

	@BeforeTest

	public void beforeTest() {

		Reporter.log("Executing Test",true);

	}

	@BeforeClass

	public void beforeClass() {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--incognito");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



	 }

	@BeforeMethod

	public void beforeMethod() {

		Reporter.log("Executing Method",true);

	}

	@AfterMethod

	public void afterMethod() {

		Reporter.log("After Method Executed",true);

	}

	@AfterClass

	public void afterClass() {

		Reporter.log("After Class Executed",true);

	}



	@AfterTest

	public void afterTest() {

		driver.findElement(By.id("react-burger-menu-btn")).click();

		driver.findElement(By.id("logout_sidebar_link")).click();



	}

	@AfterSuite

	public void afterSuite() {

		Reporter.log("After Suite Executed",true);

	}

}
