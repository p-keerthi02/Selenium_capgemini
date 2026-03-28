package HandlingFileUploadPopup;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");

        driver.findElement(By.id("fullName")).sendKeys("keerthi");

        driver.findElement(By.xpath("//input[@type='file']"))
        .sendKeys("C:\\Users\\Hp\\Downloads\\Abstract Format.docx");

    }
}
