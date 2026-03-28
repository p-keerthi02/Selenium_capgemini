//package com.orangehrm.seleniumuiframework.object_repository;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class VacanciesPage {
//	public VacanciesPage(WebDriver driver) {
//		PageFactory.initElements(driver,this);
//	}
//	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
//	private WebElement addbtn;
//	public WebElement getAddbtn() {
//		return addbtn;
//	}
//	public WebElement getclickAddbtn() {
//		return addbtn;
//	}
//	public void clickClick_btn() {
//		getclickAddbtn().click();
//	}
//	
//}


package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanciesPage {

    public VacanciesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Better locator (based on button text)
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;

    // Action method (recommended instead of exposing WebElement)
    public void clickAddButton() {
        addButton.click();
    }

    // Optional getter (only if needed)
    public WebElement getAddButton() {
        return addButton;
    }
}