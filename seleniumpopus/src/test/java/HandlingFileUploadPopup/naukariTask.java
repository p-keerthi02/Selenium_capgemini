package HandlingFileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukariTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='main-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Hp\\OneDrive\\Desktop\\keerthi-2.pdf");

	}

}
