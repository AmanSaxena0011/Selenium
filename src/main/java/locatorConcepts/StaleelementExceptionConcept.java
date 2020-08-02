package locatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleelementExceptionConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");
		Thread.sleep(6000);
		
		WebElement email = driver.findElement(By.id("username"));
		
		email.sendKeys("test@123445");
		
		driver.navigate().refresh();
		
//		email = driver.findElement(By.id("username"));
		
		email.sendKeys("aman@asdf12345");
	}

}
