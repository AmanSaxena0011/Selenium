package implicitandExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughReviseManuallywait {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");
		By email = By.id("username");

		isElementDisplayed(email, 7);
	}

	public static boolean isElementDisplayed(By locator, int timeout) {
		Boolean flag = false;
		WebElement element = null;
		
		for (int i = 0; i < timeout; i++) {
			try {
			element = driver.findElement(locator);
			element.isDisplayed();
			break;
			}
			catch (Exception e) {
				System.out.println("waiting for element to be loaded for past: "+ i + "Secs");
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		return flag;
		
	}
}
