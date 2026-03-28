package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//username
	By username = By.id("user-name");
	//pwd
	By pwd = By.id("password");
	//Login click
	By login_btn = By.id("login-button");
	
	//Buisness Logic
	public void URL(String url) {
		driver.get(url);
	}
	public void enterUserName(String un, String pass) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(pwd).sendKeys(pass);
		
	}
	public void clickLogin(String user, String pass) {
		driver.findElement(login_btn).click();
	}
}
