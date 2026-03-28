package HandlingDropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {
	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//Old Style Menu
		Select old_style= new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println(old_style.isMultiple());
		
		//Standard multi select
		WebElement Std_Multi = driver.findElement(By.id("cars"));
		Select Cars_Multi = new Select(Std_Multi);
		System.out.println(Cars_Multi.isMultiple());
		driver.quit();
//		Select old_style1= new Select(driver.findElement(By.id("react-select-4-placeholder")));
//		System.out.println(old_style1.isMultiple());
//		WebElement Std_Multi1 = driver.findElement(By.id("react-select-4-placeholder"));
//		Select Cars_Multi1 = new Select(Std_Multi1);
//		System.out.println(Cars_Multi1.isMultiple());
		 

		
		
		
	}

}
