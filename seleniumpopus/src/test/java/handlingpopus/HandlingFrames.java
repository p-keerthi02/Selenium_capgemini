package handlingpopus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
	    //1. frame switching by index
	     driver.switchTo().frame(0);
	     
	     //2. frame switching by name or id
	     driver.switchTo().frame("singleframe");
	     
	     //3. frame switching by frame element
	  WebElement frame= driver.findElement(By.cssSelector("[src='SingleFrame.html']"));
	  driver.switchTo().frame(frame);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		}

	}


