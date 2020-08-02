package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {
	//5 questions:
	//1. What is Object here ?    new ChromeDriver();		
	//2. What is Class here ?	  ChromeDriver 
	//3. What is Driver here ?    Object Reference variable	coming from webdriver interface. (Interface ref variable which is calling new chrome)
	//4. What is Webdriver here ? Interface 	
	//5. What is this concept is called ?  TopCasting.
	
	static String expectedTitle = "Google";
	
	public static void main(String[] args) throws InterruptedException {
		
//1.driver.get();
//2.driver.getTitle();		
//3.driver.getcurrentURL();	
//4.driver.getPageSource();		
//5.driver.quit(); // close the browser	
//6.Thread.sleep();		
	
	System.setProperty("webdriver.chrome.driver","D:\\Naveen\\Chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://google.com");
	driver.get("http://amazon.com");
	
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
	
//	String pgsrc = driver.getPageSource();
//	System.out.println(pgsrc);
	
	Thread.sleep(3000);
	driver.quit();

	
	
	
	
	
	
	
		
		
		


	}

}
