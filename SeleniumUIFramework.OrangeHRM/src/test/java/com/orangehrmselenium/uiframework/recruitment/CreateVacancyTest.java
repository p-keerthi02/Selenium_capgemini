//package com.orangehrmselenium.uiframework.recruitment;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
//import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
//import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
//import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;
//import com.orangehrmselenium.uiframework.GenericUtility.ActionHelper;
//import com.orangehrmselenium.uiframework.GenericUtility.BaseClass;
//import com.orangehrmselenium.uiframework.GenericUtility.ExcelUtility;
//
//public class CreateVacancyTest extends BaseClass{
//@Test
//public void addVacancy() throws Exception {
//
//        ExcelUtility eUtil = new ExcelUtility();
//   ActionHelper aHelper = new ActionHelper(driver);
//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	     	//  Page Objects
//			DashboardPage dbp = new DashboardPage(driver);
//      RecruitmentPage rp = new RecruitmentPage(driver);
//     VacanciesPage vp = new VacanciesPage(driver);
//    AddVacancyPage addvp = new AddVacancyPage(driver);
//			//Actions act=new Actions(driver);
//			// dashboard
//    dbp.clickRecuitment();
// rp.clickVacancieslink();
// // Click Add button
// vp.clickAddbtn();
// // Load Excel Data
//  String path = "./src/test/resources/OrangeHrm_commondata/vaccan.xlsx";
// eUtil.loadExcelFile(path, "Sheet1");
//
//	        eUtil.loadExcelFile(path, "Sheet1");
//	        String vacancyName = eUtil.getDataFromSingleCell(1, 1);
//	        String description = eUtil.getDataFromSingleCell(1, 2);
//	        //String hiringManager = eUtil.getDataFromSingleCell(1, 3);
//	        String positions = eUtil.getDataFromSingleCell(1, 3);
//			//add new vacancy
//			//eu.getDataFromSingleCell(1, 1);
//	        
//	        addvp.setVacancyNameTextField(vacancyName);
//
//
//			addvp.getJobTitle();;
//			addvp.clickaccount_Assistant();
//			aHelper.navigateDownDropdown(vp.getJobtitile(), 1);
//			addvp.setDescriptionTextField(description);
//			aHelper.navigateDownDropdown(vp.getJobtitile(), 1);
//			//act.sendKeys(avp.getHieringManagerTextField(),"t").pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//			//aHelper.scrollDownAutoSuggestion(avp.getHieringManagerTextField(), hiringManager, 5, 1);
//			aHelper.scrollDownAutoSuggestion(vp.getHieringManagerTextField(), "a", 5, 3);
//			 addvp.setNoOfPositionsTextField(positions);
//        addvp.clickSavebtn();
//			List<WebElement> validateionVacancyName = driver
//					.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
//
//			for (WebElement vacancy : validateionVacancyName) {
//				String name = vacancy.getText();
//				Assert.assertEquals(name, eUtil.getDataFromSingleCell(1, 1));
//				if (name.equals(eUtil.getDataFromSingleCell(1, 1))) {
//					Reporter.log("passed");
//				} else {
//					Reporter.log("failed");
//				}
//
//			}
//}
//}
package com.orangehrmselenium.uiframework.recruitment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;
import com.orangehrmselenium.uiframework.GenericUtility.ActionHelper;
import com.orangehrmselenium.uiframework.GenericUtility.BaseClass;
import com.orangehrmselenium.uiframework.GenericUtility.ExcelUtility;

public class CreateVacancyTest extends BaseClass{


@Test
public void addVacancy() throws Exception {

    ExcelUtility eUtil = new ExcelUtility();
    ActionHelper aHelper = new ActionHelper(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Page Objects
    DashboardPage dbp = new DashboardPage(driver);
    RecruitmentPage rp = new RecruitmentPage(driver);
    VacanciesPage vp = new VacanciesPage(driver);
    AddVacancyPage addvp = new AddVacancyPage(driver);

    // Navigation
    dbp.clickRecruitment();
    rp.clickVacancieslink();
    vp.clickAddButton();

    // Load Excel Data
    String path = "./src/test/resources/OrangeHRM_Common_Data/vaccan.xlsx";
    eUtil.loadExcelFile(path, "Sheet1");

    String vacancyName = eUtil.getDataFromSingleCell(1, 1);
    String description = eUtil.getDataFromSingleCell(1, 2);
    //String hiringManager = eUtil.getDataFromSingleCell(1, 3);
    String positions = eUtil.getDataFromSingleCell(1, 3);
	//add new vacancy
	//eu.getDataFromSingleCell(1, 1);

    // Add Vacancy
    addvp.enterVacancyName(vacancyName);
    addvp.selectJobTitle();
    addvp.enterDescription(description);

    // Hiring Manager (Auto suggestion)
//    aHelper.scrollDownAutoSuggesstion(
//    		 "a", addvp.getHiringManagerTextField(), 5, 2);
    aHelper.scrollDownAutoSuggesstion(addvp.getHiringManagerTextField(), "a", 5, 3);
    addvp.enterNoOfPositions(positions);
    addvp.clickSave();

    // Wait until table loads
    wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//div[@class='oxd-table-body']")));

    // Validation
    List<WebElement> vacancyList = driver.findElements(
        By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));

    boolean isFound = false;

    for (WebElement vacancy : vacancyList) {
        String text = vacancy.getText();
        if (text.contains(vacancyName)) {
            isFound = true;
            break;
        }
    }

    Assert.assertTrue(isFound, "Vacancy NOT created");
    Reporter.log("Vacancy created successfully", true);
}
}