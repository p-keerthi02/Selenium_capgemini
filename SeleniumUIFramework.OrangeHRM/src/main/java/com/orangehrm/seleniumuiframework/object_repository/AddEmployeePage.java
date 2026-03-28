package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	WebDriver driver;

	// Constructor - to connect the driver
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Textbox - FirstName
	@FindBy(name = "firstName")
	private WebElement firstname;

	// Textbox - MiddleName
	@FindBy(name = "middleName")
	private WebElement middlename;

	// Textbox - "LastName"
	@FindBy(name = "lastName")
	private WebElement lastname;

	// Textbox - Emp Id
	@FindBy(xpath = "//label[. = 'Employee Id']/../..//input")
	private WebElement empid;

	// Toggle - create login
	@FindBy(xpath = "//span[@class = 'oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement createlogin_toggle;

	// Textbox - Username
	@FindBy(xpath = "//label[. ='Username']/../..//input")
	private WebElement username;

	// Textbox - password
	@FindBy(xpath = "//label[. ='Password']/../..//input")
	private WebElement password;

	// Textbox - Confirm passwrd
	@FindBy(xpath = "//label[. ='Confirm Password']/../..//input")
	private WebElement confirm_password;

	// Button - Save
	@FindBy(xpath = "//button[. =' Save ']")
	private WebElement save_btn;

	// Getters and setters of Firstname
	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String valid_firstname) {
		getFirstname().sendKeys(valid_firstname);
	}

	// Getters and setters of Middlename
	public WebElement getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String valid_middlename) {
		getMiddlename().sendKeys(valid_middlename);
	}

	// Getters and setters of LastName
	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String valid_lastname) {
		getLastname().sendKeys(valid_lastname);
	}

	// Getters and setters of Emp id
	public WebElement getEmpid() {
		return empid;
	}

	public void setEmpid(String valid_empid) {
		getEmpid().clear();
		getEmpid().sendKeys(valid_empid);
	}

	// Getters and click of Toggle
	public WebElement getCreatelogin_toggle() {
		return createlogin_toggle;
	}

	public void clickCreatelogin_toggle() {
		getCreatelogin_toggle().click();
	}

	// Getters and setters of Username
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String valid_username) {
		getUsername().sendKeys(valid_username);
	}

	// Getters and setters of Password
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String valid_password) {
		getPassword().sendKeys(valid_password);
	}

	// Getters and setters of Confrim password
	public WebElement getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String valid_confirm_password) {
		getConfirm_password().sendKeys(valid_confirm_password);
	}

	// Getters and click of Save button
	public WebElement getSave_btn() {
		return save_btn;
	}

	public void clickSave_btn() {
		getSave_btn().click();
	}

	// Business Logic - Add employee
	public void addEmp(String fname, String mname, String lname, String eid) {
		setFirstname(fname);
		setMiddlename(mname);
		setLastname(lname);
		setEmpid(eid);
		clickCreatelogin_toggle();
	}

	// Business Logic - Create cresitionals
	public void createCreditionals(String uname, String pwd) {
		setUsername(uname);
		setPassword(pwd);
		setConfirm_password(pwd);
		clickSave_btn();
	}
}