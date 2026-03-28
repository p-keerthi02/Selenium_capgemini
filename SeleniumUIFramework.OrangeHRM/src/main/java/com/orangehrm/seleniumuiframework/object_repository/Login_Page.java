package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Username
	@FindBy(name="username")
	private WebElement username;
	
	//ppassword
	@FindBy(name="password")
	private WebElement password;
	
	//submit
	@FindBy(css="[type='submit']")
	private WebElement loginBtn;
	
	
	
	//forgot password
	@FindBy(css="class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"")
	private WebElement forgotpwd;
	
	//Linkedin link
	@FindBy(xpath="[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement LinkedIn;
	
	//Facebook link
	@FindBy(xpath="[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement Facebook;
	
	//Twitter link
	@FindBy(xpath="[href='https://twitter.com/orangehrm?lang=en']")
	private WebElement Twitter;
	
	//Youtube link
	@FindBy(xpath="[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement YouTube;

	//getter & setter of username
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String valid_username) {
		getUsername().sendKeys(valid_username);
	}
	
	//getter & setter of password
	public WebElement getPassword() {
		return password;
	}
	
	public void setPassword(String valid_password) {
		getPassword().sendKeys(valid_password);
	}

	//getter & setter of loginbutton
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn() {
		getLoginBtn().click();
	}
	
	//getter & setter of forgot password
	public WebElement getForgotpwd() {
		return forgotpwd;
	}

	public void setForgotpwd() {
		getForgotpwd().click();
	}
	
	//getter & setter of LinkedIn
	public WebElement getLinkedIn() {
		return LinkedIn;
	}

	public void setLinkedIn() {
		getLinkedIn().click();
	}
	
	//getter & setter of Facebook link
	public WebElement getFacebook() {
		return Facebook;
	}

	public void setFacebook() {
		getFacebook().click();
	}
	
	
	//getter & setter of Twitter Link
	public WebElement getTwitter() {
		return Twitter;
	}

	public void setTwitter() {
		getTwitter().click();
	}

	//getter & setter of youtube link
	public WebElement getYouTube() {
		return YouTube;
	}

	public void setYouTube() {
		getYouTube().click();
	}
	//Business Logic
	public void Login(String valid_username,String valid_password) {
		setUsername(valid_username);
		setPassword(valid_password);
		setLoginBtn();
		
	}
	
}
