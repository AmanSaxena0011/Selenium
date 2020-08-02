package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) throws InterruptedException {

		
//		-----Chrome
		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver();
//		---------Firefox
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		-----IE	
//		WebDriverManager.iedriver().setup();
//		WebDriver driver = new InternetExplorerDriver();

		
		
		
		
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.quit();

		
		
		
	}

}
