package locatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotloginWith5thmethd {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");
		Thread.sleep(7000);
	
	
	By email = By.id("username");
	By password = By.id("password");
	By LoginButton = By.id("loginBtn");
	
	doSendKeys(email, "Aman.saxena@india.nec.com");
	doSendKeys(password, "Password@123");
	doClick(LoginButton);
	
	driver.quit();
	
	}

	
	public static WebElement getElement (By Locator) {
		WebElement Element = driver.findElement(Locator);
		return Element;
	}
	
	public static void doSendKeys (By Locator, String value) {
	getElement(Locator).sendKeys(value);
	}
	
	public static void doClick (By Locator) {
		getElement(Locator).click();
		}
		
	
	
	
}
