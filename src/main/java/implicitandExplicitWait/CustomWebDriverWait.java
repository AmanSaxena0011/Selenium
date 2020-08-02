package implicitandExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWebDriverWait {

	public static WebDriver driver;
	
	public CustomWebDriverWait(WebDriver driver) {
		this.driver = driver;
	}
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");
		
		By email = By.id("username");
		By password = By.id("password");
		By LoginButton = By.id("loginBtn");
		
		WebElement emailweb = driver.findElement(email);

		getPageTitle(10, "HubSpot L");
		getCurrentUrl(10, "app.hubspot");
			
		waitForElementPresent(10, email).sendKeys("aman.saxena0011@gmail.com");
		waitForElementPresent(1, password).sendKeys("aman.saxena0011@gmail.com");
		waitForElementToBeClickable(10, LoginButton).click();
	}
	
	public static String getPageTitle(int timeout,String titlecontains) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(titlecontains));
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public static String getCurrentUrl( int timeout,String urlcontains) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(urlcontains));
		 System.out.println(driver.getCurrentUrl());
		 return driver.getCurrentUrl();
	}
	
	public static WebElement waitForElementPresent(int timeout,By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement waitForElementToBeClickable(int timeout,By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	

	public static void clickWhenReady(int timeout,By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();;
	}
	
	
}
