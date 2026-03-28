package window_scrolling;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingBy_To {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//Navigate to URL
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				
				//Scrolling by using Scroll BY -- continue from that place
				JavascriptExecutor js_By = (JavascriptExecutor) driver;
				js_By.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
				js_By.executeScript("window.scrollBy(0,1500)");
				Thread.sleep(2000);
				
				//Scrolling by using Scroll TO -- Starts from the origin
				JavascriptExecutor js_To = (JavascriptExecutor) driver;
				js_To.executeScript("window.scrollTo(0,1000)");
				Thread.sleep(2000);
				js_To.executeScript("window.scrollTo(0,1500)");
				Thread.sleep(2000);
				

	}

}
