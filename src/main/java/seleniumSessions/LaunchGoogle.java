package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	static String ExpectedTitle = "Google";
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Naveen\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://google.com");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
//		String PSource = driver.getPageSource();
//		System.out.println(PSource);
		
		String actualTitle = driver.getTitle();
		System.out.println("The actual tested title is: "+ actualTitle);
	
	if (ExpectedTitle.equals(actualTitle)) {
		System.out.println("Pass");
		
		}
	else {
			System.out.println("Fail");
	}
	
	Thread.sleep(5000);
	driver.quit();
	
	
	

	}

}
