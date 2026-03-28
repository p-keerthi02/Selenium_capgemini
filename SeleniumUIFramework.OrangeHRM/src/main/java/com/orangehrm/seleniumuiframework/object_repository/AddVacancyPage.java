//package com.orangehrm.seleniumuiframework.object_repository;
//
//
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.support.FindBy;
//	import org.openqa.selenium.support.PageFactory;
//
//	public class AddVacancyPage {
//		public AddVacancyPage(WebDriver driver) {
//			PageFactory.initElements(driver,this);
//		}
//		@FindBy(xpath = "//label[.='Vacancy Name']/../..//input")
//		private WebElement vacancyNameTextField;
//		
//		@FindBy(xpath = "//label[.='Job Title']/../..//i")
//		private WebElement jobTitle;
//		
//		@FindBy(css = "[placeholder='Type description here']")
//		private WebElement descriptionTextField;
//		
//		@FindBy(xpath = "//label[.='Hiring Manager']/../..//input")
//		private WebElement hiringManagerTextField;
//		
//		@FindBy(xpath = "//label[.='Number of Positions']/../..//input")
//		private WebElement noOfPositionsTextField;
//		
//		@FindBy(xpath="//button[.=' Save ']")
//		private WebElement savebtn;
//		
//		
//		public WebElement getVacancyNameTextField() {
//			return vacancyNameTextField;
//		}
//
//		public void setVacancyNameTextField(String vacancyNameTextField) {
//			getVacancyNameTextField().sendKeys(vacancyNameTextField);
//		}
//
//		public WebElement getJobTitle() {
//			return jobTitle;
//		}
//
//		
//		public WebElement getDescriptionTextField() {
//			return descriptionTextField;
//		}
//
//		public void setDescriptionTextField(String descriptionTextField) {
//			getDescriptionTextField().sendKeys("This position is open");
//		}
//
//		public WebElement getHiringManagerTextField() {
//			return hiringManagerTextField;
//		}
//
//		
//
//		public WebElement getNoOfPositionsTextField() {
//			return noOfPositionsTextField;
//		}
//
//		public void setNoOfPositionsTextField(String noOfPositionsTextField) {
//			getNoOfPositionsTextField().sendKeys(noOfPositionsTextField);
//		}
//
//		public WebElement getSavebtn() {
//			return savebtn;
//		}
//
//		public void clickSavebtn() {
//			getSavebtn().click();
//		}
//	}
//

package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {

    public AddVacancyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[.='Vacancy Name']/../..//input")
    private WebElement vacancyNameTextField;

    @FindBy(xpath = "//label[.='Job Title']/../..//i")
    private WebElement jobTitleDropdown;

    @FindBy(xpath = "//span[text()='Account Assistant']")
    private WebElement accountAssistantOption;

    @FindBy(css = "[placeholder='Type description here']")
    private WebElement descriptionTextField;

    @FindBy(xpath = "//label[.='Hiring Manager']/../..//input")
    private WebElement hiringManagerTextField;

    @FindBy(xpath = "//label[.='Number of Positions']/../..//input")
    private WebElement noOfPositionsTextField;

    @FindBy(xpath = "//button[.=' Save ']")
    private WebElement savebtn;

    // ================= ACTION METHODS =================

    public void enterVacancyName(String vacancyName) {
        vacancyNameTextField.clear();
        vacancyNameTextField.sendKeys(vacancyName);
    }

    public void selectJobTitle() {
        jobTitleDropdown.click();
        accountAssistantOption.click();
    }

    public void enterDescription(String description) {
        descriptionTextField.clear();
        descriptionTextField.sendKeys(description);
    }

    public WebElement getHiringManagerTextField() {
        return hiringManagerTextField;
    }

    public void enterNoOfPositions(String positions) {
        noOfPositionsTextField.clear();
        noOfPositionsTextField.sendKeys(positions);
    }

    public void clickSave() {
        savebtn.click();
    }
}