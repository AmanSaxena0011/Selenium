package alertPopupHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	
		static String expectedTitle = "Google";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions objf = new FirefoxOptions();
		objf.addArguments("--Headless");
		
		WebDriver driver = new FirefoxDriver(objf);
		
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions obj = new ChromeOptions();
//	obj.addArguments("--Headless");
//	WebDriver driver =new ChromeDriver(obj);
	
	
	
	
	driver.get("http://google.com");

	
String actualtitle = driver.getTitle();
System.out.println("The title of the URL is: "+ actualtitle);
	
	if (actualtitle.equals(expectedTitle)) {
	System.out.println("This is correct title");
	}
	else {
		System.out.println("This is incorrect title");
	}
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("google")) {
			System.out.println("Correct URL");
		}
	
	Thread.sleep(3000);
	driver.quit();

	}

}
