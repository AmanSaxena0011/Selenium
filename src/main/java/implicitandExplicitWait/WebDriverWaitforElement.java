package implicitandExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitforElement {
	static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://app.hubspot.com");
		
		By email = By.id("username");
		By password = By.id("password");
		By LoginButton = By.id("loginBtn");
		
		waitforElementPresent(driver, 10, email).sendKeys("Aman.saxena@india.nec.com");
		waitforElementPresent(driver, 10, password).sendKeys("Aman.saxena@india.nec.com");
		waitforElementPresent(driver, 1, LoginButton).click();
		
		

	}
	
	public static WebElement waitforElementPresent(WebDriver driver , int time,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
