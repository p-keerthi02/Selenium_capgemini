package com_webelements_API1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='Male']")).click();
	}

}
