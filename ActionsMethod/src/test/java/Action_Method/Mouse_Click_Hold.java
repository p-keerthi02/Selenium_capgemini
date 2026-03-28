package Action_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Click_Hold {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate the URL
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		//Click and hold the element
		WebElement Circle_Hold =  driver.findElement(By.id("circle"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(Circle_Hold).build().perform();
		
		//Release the element after 5 seconds
		action.clickAndHold(Circle_Hold).pause(5000).release().perform();
		
	}

}
