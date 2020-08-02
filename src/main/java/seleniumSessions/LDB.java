package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LDB {

	static WebDriver driver;
	static String ExpectedTitle = "Best Online Container, Logistics & Shipment Tracking System India";
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ldbstaging.co.in/ldb/containersearch");
		driver.manage().window().maximize();
		
	String Actualtitle = driver.getTitle();	
		System.out.println(Actualtitle);
		if (ExpectedTitle.contentEquals(Actualtitle) ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
		driver.findElement(By.linkText("Accept")).click();
	
	
	
	
	
	
	
	
	
	
	}
}
