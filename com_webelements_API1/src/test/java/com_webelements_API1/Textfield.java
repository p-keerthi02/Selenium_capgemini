package com_webelements_API1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.cssSelector("[placeholder=\'First Name\']"));
		firstname.sendKeys("Monica");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder=\'Last Name\']")).sendKeys("D");
		Thread.sleep(2000);
		firstname.clear();
		Thread.sleep(2000);
		firstname.sendKeys("keerthi");
	}

}
