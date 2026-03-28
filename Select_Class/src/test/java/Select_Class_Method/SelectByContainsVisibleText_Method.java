package Select_Class_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByContainsVisibleText_Method {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		// Locating Skills dropdown
		WebElement Skill_Select = driver.findElement(By.id("Skills"));
		// Making Object of select class (Object creation -> Instantiation)
		Select select = new Select(Skill_Select);
		// Calling select method by visibletext
		select.selectByContainsVisibleText("script");
		Thread.sleep(2000);
     }

}
