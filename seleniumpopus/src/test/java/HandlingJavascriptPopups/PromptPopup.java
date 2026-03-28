package HandlingJavascriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert prompt=driver.switchTo().alert();

		prompt.sendKeys("KEERTHI");

		prompt.accept();
//		System.out.println(prompt.getText());

	}

}
