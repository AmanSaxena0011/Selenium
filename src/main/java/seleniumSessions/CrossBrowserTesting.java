package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Naveen\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Naveen\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		else {
			System.out.println("Pleaase provide correct browser name: " + browser);
		}
		
		
		driver.get("http://google.com");
		driver.quit();
		
		
		
	}

}
