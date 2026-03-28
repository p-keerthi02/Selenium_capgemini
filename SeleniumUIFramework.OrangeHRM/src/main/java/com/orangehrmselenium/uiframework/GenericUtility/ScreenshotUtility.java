package com.orangehrmselenium.uiframework.GenericUtility;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
public class ScreenshotUtility {
	public String captureScreenshot(WebDriver driver, String testName) {
		String Timestamp=new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
		String path=System.getProperty("./reports/"+Timestamp+".png");
		TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	try {
		File perm=new File(path);
		FileHandler.copy(temp,perm);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return path;
	}
	//capture web element 
	public String captureScreenshot(WebElement element,String elementName) throws IOException {
		String Timestamp=new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
		String path="./reports/"+elementName+Timestamp+".png";
	File temp=element.getScreenshotAs(OutputType.FILE);
	try {
	File perm=new File(path);
	FileHandler.copy(temp,perm);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return path;
	}
}