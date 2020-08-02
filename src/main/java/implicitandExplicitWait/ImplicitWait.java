package implicitandExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://app.hubspot.com");
		System.out.println(driver.getTitle());   // imp wait does not work for this non webelement operation , for this we need to use exp wait 
		driver.findElement(By.id("username")).sendKeys("Aman@gamail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Amanamailcom");

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify imp wait
		driver.findElement(By.id("loginBtn")).click();
		
	}

}
