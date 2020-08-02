package implicitandExplicitWait;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import alertPopupHandle.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VisiblityofAllEmenetsTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footer = By.cssSelector("ul.footer-nav li a");
		
		ElementUtil elementutil = new ElementUtil(driver);
		List<WebElement> footerlinks = elementutil.visibilityofAllElements(10,footer);
		
		List<String> footerlinksarray = new ArrayList<String>();
		
		for (int i = 0; i <footerlinks.size(); i++) {
			String text = footerlinks.get(i).getText();
//			System.out.println(text);
			footerlinksarray.add(text);
		}
		
		System.out.println(footerlinksarray);
		

	
	}

}
