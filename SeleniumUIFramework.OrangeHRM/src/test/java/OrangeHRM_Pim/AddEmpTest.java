package OrangeHRM_Pim;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.Login_Page;
import com.orangehrm.seleniumuiframework.object_repository.PimPage;



public class AddEmpTest {

	WebDriver driver;
	
	@Test
	public void AddEmployee() {
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Login_Page lp=new Login_Page(driver);
		 DashboardPage dbp = new DashboardPage(driver);
		 PimPage pp = new PimPage(driver);
		 AddEmployeePage aep = new AddEmployeePage(driver);
		 

		 //Login
		 lp.Login("Admin", "admin123");
		//Navigate to PIM 
		dbp.clickPim_module();
//		//Add user
		pp.clickAdd_btn();
////		//Add Emp
		aep.addEmp("Rohan", "K", "Krisha", "145");
		aep.createCreditionals("rohankrisha", "rohan123");
	}
}