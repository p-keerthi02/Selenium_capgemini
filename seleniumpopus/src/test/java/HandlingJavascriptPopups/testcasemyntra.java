package HandlingJavascriptPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcasemyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("dresses",Keys.ENTER);
		driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		String Parent_Id = driver.getWindowHandle();
		Set<String> Child_Id = driver.getWindowHandles();
		Child_Id.remove(Parent_Id);
		for (String str : Child_Id) {
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		WebElement Login_Verify = driver.findElement(By.xpath("//input[@type ='tel']"));
		if (Login_Verify.isDisplayed()) {
			System.out.println("Testcase Status : Passed");
		} else {
			System.out.println("Testcase Status : Failed");
		}
	}

}
