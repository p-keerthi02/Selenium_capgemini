package Select_Class_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption_Method {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//Locating standard multi select using id
		Select sel = new Select(driver.findElement(By.id("cars")));
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Opel");
		
		System.out.println(sel.getFirstSelectedOption().getText());

	}

}
