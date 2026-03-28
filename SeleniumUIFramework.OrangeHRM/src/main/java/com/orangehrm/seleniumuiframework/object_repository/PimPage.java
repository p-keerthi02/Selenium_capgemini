package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	
	WebDriver driver;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Add - button
	@FindBy(xpath = "//button[contains(. , ' Add')]")
	WebElement add_btn;

	//Getters and setters of Add button
	public WebElement getAdd_btn() {
		return add_btn;
	}

	public void clickAdd_btn() {
		getAdd_btn().click();
	}
	
}
