package GenericUtility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing before test");
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Executing After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Executing After Test");
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing After Suite");

}

}
