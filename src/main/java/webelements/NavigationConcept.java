package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("http://google.com");
		 System.out.println(driver.getTitle());
		 
//		 back & forward button operation
		 
		 driver.navigate().to("http://amazon.com");
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().refresh();
		 

	}

}
