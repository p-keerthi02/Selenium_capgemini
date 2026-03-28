package com.orangehrmselenium.uiframework.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class ActionHelper {

	WebDriver driver;
	Actions act;

	public ActionHelper(WebDriver driver) {
		this.driver = driver;
	}

	// Move to element and click
	public void clickOnElement(WebElement element) {
		act.moveToElement(element).click().perform();
	}

	public void navigateDownDropdown(WebElement element, int downArrowIndex) {

		act.click(element).perform();
		for (int i = 1; i <= downArrowIndex; i++) {
			act.keyDown(Keys.DOWN).perform();

		}
		act.keyDown(Keys.ENTER).perform();

	}
	public void scrollDownAutoSuggesstion(WebElement element,String text,long timeInSec,int downArrowIndex ) {
		act.sendKeys(element,text).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=1;i<=downArrowIndex ; i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
	}
	//right click 
	public void rightClick(WebElement element) {
	    act.contextClick(element).perform();
	}
}
