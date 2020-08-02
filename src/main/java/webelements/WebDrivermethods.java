package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * this Utility is used to get different methods Browser launch , URL launch , pagesource , close  of browser
 * @author Aman.Saxena
 *
 */
public class WebDrivermethods {

 public WebDriver driver;
 
 
/**
 * This method is user to launch the browser on the basis of given browser name as string
 * @param browser
 * @return driver
 */

	public WebDriver LauchBrowser(String browser) {
		
		System.out.println("browser which is going to launch is:" + browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please provide the correct browser name: "+ browser);
		}
			return driver;
	}
	
	
	
	/**
	 * This method is used to launch the URL
	 * @param URL
	 */
	public void launchURL(String URL) {
		driver.get(URL);
	}
	
	/**
	 * This method is used to get Page title
	 * @return page title
	 */
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * to get current URL
	 * @return URL
	 */
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	
	public void closeBrowser() {
		driver.close();
	}
		
	
}
