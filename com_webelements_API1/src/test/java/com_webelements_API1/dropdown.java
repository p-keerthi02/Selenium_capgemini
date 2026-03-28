package com_webelements_API1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		Thread.sleep(2000);
		skillsDropDown.click();
	    skillsDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.
	    		ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

	}

}
