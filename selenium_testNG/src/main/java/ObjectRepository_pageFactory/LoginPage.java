package ObjectRepository_pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Textbox - username
	@FindBy(name = "username")
	private WebElement username;
	
	//Textbox - pwd
	@FindBy(name = "password")
	private WebElement password;
	
	//Submit - button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_btn;
	
	//Submit - forgot pwd button
	@FindBy(xpath = "//p[contains(@class,'orangehrm-login-forgot-header')]")
	private WebElement forgot_pwd;
	
	//LinkedIn - link
	@FindBy(css = "a[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedln_link;
	
	//Facebook - link
	@FindBy(css = "a[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebook_link;
	
	//Twitter - link
	@FindBy(xpath = "//a[contains(@href,'twitter.com')]")
	private WebElement twitter_link;
	
	//Youtube - link
	@FindBy(css = "a[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtube_link;
	

	
	//Getters and setters of Username
	public WebElement getUsername() {
		return username;
	}


	public void setUsername(String valid_username) {
		getUsername().sendKeys(valid_username);
	}

	//Getters and setters of Password
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String valid_password) {
		getPassword().sendKeys(valid_password);
	}

	//Getters and setters of Login-button
	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void clickLogin_btn() {
		getLogin_btn().click();
	}

	//Getters and setters of Forgot_pwd-button
	public WebElement getForgot_pwd() {
		return forgot_pwd;
	}

	public void clickForgot_pwd() {
		getForgot_pwd().click();
	}

	//Getters and setters of LinkedIn_link
	public WebElement getLinkedln_link() {
		return linkedln_link;
	}

	public void clickLinkedln_link() {
		getLinkedln_link().click();	
	}

	//Getters and setters of Facebook_login
	public WebElement getFacebook_link() {
		return facebook_link;
	}

	public void clickFacebook_link() {
        getFacebook_link().click();
	}

	//Getters and setters of Twitter_link
	public WebElement getTwitter_link() {
		return twitter_link;
	}

	public void clickTwitter_link() {
		getTwitter_link().click();
	}

	//Getters and setters of Youtube_link
	public WebElement getYoutube_link() {
		return youtube_link;
	}

	public void clickYoutube_link() {
		getYoutube_link().click();
	}
	
	
	//Business logic of login
	public void login(String valid_uname, String valid_pwd) {
		setUsername(valid_uname);
		setPassword(valid_pwd);
		clickLogin_btn();
	}
}