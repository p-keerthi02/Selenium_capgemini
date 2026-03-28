package Select_Class_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method {

public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		//Navigate to URL
//		driver.get("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(2000);
//		
//		//Locating Skills dropdown
//		WebElement Skill_Select = driver.findElement(By.id("Skills"));
//		//Making Object of select class (Object creation -> Instantiation)
//		Select select = new Select(Skill_Select);
//		
//		//Fetch all the Options
//		List<WebElement> GetOpt =select.getOptions();
//		for(WebElement opt : GetOpt) {
//			System.out.println(opt.getText());
//		}
		
		//Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
		//Locating Skills dropdown
		WebElement Skill_Option = driver.findElement(By.id("options"));
		//Making Object of select class (Object creation -> Instantiation)
		Select select = new Select(Skill_Option);
		//Fetch all the options
		for(WebElement opt : select.getOptions()) {
			System.out.println(opt.getText());
		}
		
		driver.quit();
	}

}
