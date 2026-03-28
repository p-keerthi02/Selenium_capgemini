package seleniumpopus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		String parentId = driver.getWindowHandle();
		Set<String>allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String childId:allWindowId) {
			driver.switchTo().window(childId);
		}
		WebElement addtocart = driver.findElement(By.tagName("button"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		
		WebElement cartLogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		
		WebElement shoppingCart = driver.findElement(By.tagName("h2"));
		if(shoppingCart.isDisplayed()) {
			System.out.println("Testcase status is passed");
		}
		else {
			System.out.println("Testcase status is failed");
		}
		driver.quit();
		
		
		

	}

}
