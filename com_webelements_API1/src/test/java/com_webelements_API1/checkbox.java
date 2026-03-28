package com_webelements_API1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//clicking on cricket checkbox
		WebElement elem=driver.findElement(By.id("checkbox1"));
		elem.click();
		Thread.sleep(2000);
		elem.click();
	}

}
