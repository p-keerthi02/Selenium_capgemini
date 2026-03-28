package Select_Class_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectBy_Method {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);

		// Locating Skills dropdown
		WebElement Add_Select = driver.findElement(By.id("select-multiple-native"));
		// Making Object of select class (Object creation -> Instantiation)
		Select select = new Select(Add_Select);
		
		// Calling select method by visible text
		select.selectByVisibleText("Mens Cotton Jacket...");
		select.selectByVisibleText("WD 2TB Elements Port...");
		select.selectByVisibleText("Acer SB220Q bi 21.5 ...");
		select.selectByVisibleText("SanDisk SSD PLUS 1TB...");
		select.selectByValue("Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5");
		Thread.sleep(2000);
		
		
		//Deselect method by visible text , value
		select.deselectByIndex(2);
		select.deSelectByContainsVisibleText("WD 2TB Elements Port...");
		select.deselectByValue("Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5");
		
		driver.findElement(By.xpath("//button[. = 'Add']")).click();
		Thread.sleep(2000);
		
		//Deselecting All
		select.deselectAll();
		driver.findElement(By.xpath("//button[. = 'Add']")).click();
		Thread.sleep(2000);
		
		
     }

}
