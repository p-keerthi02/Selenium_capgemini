package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	 public WebDriver driver;

	    // Constructor
	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // ================= WebElements =================

	    @FindBy(xpath = "//span[.='PIM']")
	    private WebElement pimModule;

	    @FindBy(xpath = "//span[.='Recruitment']")
	    private WebElement recruitmentModule;

	    @FindBy(xpath = "//i[contains(@class,'oxd-userdropdown-icon')]")
	    private WebElement userDropdown;

	    @FindBy(xpath = "//a[text()='Logout']")
	    private WebElement logoutBtn;

	    // ================= Actions =================

	    public void clickPim() {
	        pimModule.click();
	    }

	    public WebElement clickRecruitment() {
	        recruitmentModule.click();
	        return recruitmentModule;
	    }

	    public void clickUserDropdown() {
	        userDropdown.click();
	    }

	    public void clickLogout() {
	        logoutBtn.click();
	    }

	    public void logout() {
	        userDropdown.click();
	        logoutBtn.click();
	    }
	}