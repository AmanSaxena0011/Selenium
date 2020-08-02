package implicitandExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitWithoutSeleniMethods {
	

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");
		By email = By.id("username");
		
		isElementDisplayed(email, 8);
		
}
	
	public static boolean isElementDisplayed( By locator, int timeout ) {
		boolean flag = false;
		WebElement element = null;
		
		for (int i = 0; i < timeout; i++) {
		
		
	try {
			element = driver.findElement(locator);
			flag = element.isDisplayed();
			break;
		}
		catch (Exception e) {
			System.out.println("Waiting for element to be presented on the page:" + i + "Seconds");
		try {
			Thread.sleep(1000);
		} catch (Exception e2) {
					}
		
		
		}}
		return flag;}	
	}
