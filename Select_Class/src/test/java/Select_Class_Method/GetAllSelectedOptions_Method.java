package Select_Class_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions_Method {

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
		
		List<WebElement> Selected_Options = sel.getAllSelectedOptions();
		for(WebElement ele : Selected_Options) {
			System.out.println(ele.getText());
		}
	}

}


