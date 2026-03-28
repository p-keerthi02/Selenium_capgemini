package HandlingJavascriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		Thread.sleep(5000);
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.dismiss();

	}

}
