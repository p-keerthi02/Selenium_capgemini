package Practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class DemoTest extends BaseClass {
	@Test(priority = 0)
	public void logIn(Method m1) {
		System.out.println("Executing:-"+m1);
	}
	@Test(dependsOnMethods = "logIn")
	public void addEmployee(Method m2) {
		System.out.println("Executing:-"+m2);
	}
	@Test(dependsOnMethods = "logIn")
	public void logout(Method m3) {
		System.out.println("Executing:-"+m3);
	}
}
