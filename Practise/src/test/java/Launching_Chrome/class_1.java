package Launching_Chrome;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/");
		//Validating the title
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equals("Your Store")) {
			System.out.println("Validation succesful");
		}
		else {
			System.out.println("Validation failed");
		}

	}

}
