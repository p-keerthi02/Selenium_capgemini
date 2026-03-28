package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class deselectmethods {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(3000);
Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
sel.selectByVisibleText("Fjallraven - Foldsac...");
sel.selectByVisibleText("Mens Casual Premium ...");
Thread.sleep(3000);
sel.deselectByIndex(1);
Thread.sleep(2000);
sel.deselectAll();
sel.selectByContainsVisibleText("John Hardy Women's L...");
Thread.sleep(2000);
sel.deSelectByContainsVisibleText("John Hardy Women's L...");
Thread.sleep(2000);
sel.selectByValue("Lock and Love Women's Removable Hooded Faux Leather Moto Biker Jacket");
Thread.sleep(2000);
sel.deselectByValue("Lock and Love Women's Removable Hooded Faux Leather Moto Biker Jacket");
java.util.List<WebElement>alloption=sel.getOptions();
for(WebElement opt:alloption) {
	System.out.println(opt.getText());
}
	}}
