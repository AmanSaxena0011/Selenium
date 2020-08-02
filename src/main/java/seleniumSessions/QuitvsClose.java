package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\Naveen\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
//		driver.quit();
//		NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		driver.close();
//		NoSuchSessionException: invalid session id
		driver = new ChromeDriver();
		driver.get("http://google.com"); 	
		System.out.println(driver.getTitle());
	 
		// perform debug line by line and check mouse on driver link of each line of code and observe the Session ID , as the quit command is executed, the session ID is changed to NUll.
		
	}

}
