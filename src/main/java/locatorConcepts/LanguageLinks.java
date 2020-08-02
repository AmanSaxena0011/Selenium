package locatorConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.in");
		
		List<WebElement> langList = driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
		
		for (int i = 0; i < langList.size(); i++) {
			langList.get(i).click();
		 langList = driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
		}

	}

}
