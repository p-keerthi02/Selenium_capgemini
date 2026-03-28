package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
public RecruitmentPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(linkText="Vacancies")
private WebElement vacancieslink;
public WebElement getVacancieslink() {
	return vacancieslink;
}
public void clickVacancieslink() {
	getVacancieslink().click();
}

}