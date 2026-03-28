package Practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORANGE {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        boolean status = driver.findElement(By.linkText("OrangeHRM, Inc")).isDisplayed();
        System.out.println(status);

        String parentWindow = driver.getWindowHandle();
        System.out.println("Id of parent window: " + parentWindow);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Thread.sleep(2000);

        Set<String> allWindows = driver.getWindowHandles();

        for(String window : allWindows) {
            if(!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("orangehrm.com")) {
            System.out.println("URL contains valid HRM");
        }

        String title = driver.getTitle();
        System.out.println(title);
        if(!title.isEmpty()) {
            System.out.println("Title Is validated");
        }

        driver.close();

        driver.switchTo().window(parentWindow);

        if(driver.findElement(By.name("username")).isDisplayed()) {
            System.out.println("Login Page is Displayed");
        }

//        driver.quit();
    }
}


