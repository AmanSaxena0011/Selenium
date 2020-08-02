package implicitandExplicitWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class FluentWait {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://app.hubspot.com");
		
		By email = By.id("username");
		By password = By.id("password");
		By LoginButton = By.id("loginBtn");
		

		
/*
		
		============================Need to ask Naveen , why it is not working=============================		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(12))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("aman.saxena");
	

	}

}


==============Copy pasted from naveen code================


public static WebElement waitForElementWithFluentWaitConcept(WebDriver driver, By locator, int timeOut){
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(NoSuchElementException.class);
	
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}

*/
		
	}
}
