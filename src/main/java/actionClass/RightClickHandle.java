package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement rightClick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		By rightoptions = 	By.xpath("//ul[@class = 'context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
	
			getrightclicked(rightClick);
		
			getrightclickOptions(rightoptions, "Paste");
	
	}

	public static void getrightclicked(WebElement element) {
		Actions ac = new Actions(driver);
//		ac.contextClick().perform();
		ac.contextClick(element).perform();
	}
	
	public static void getrightclickOptions(By locator,String Value) {
		
		List<WebElement> rightClickOptions  =	driver.findElements(locator);
		System.out.println(rightClickOptions.size());
		
		for (int i = 0; i < rightClickOptions.size(); i++) {
			String text = rightClickOptions.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(Value)) {
				rightClickOptions.get(i).click();
				break;
			}
		}
		
		driver.switchTo().alert().accept();
	}
	
}
