package locatorConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageList {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.in");

		languageClick("हिन्दी");
		
			}

	
	/**
	 * This method will be used to get the language clicked
	 * @param languageName
	 */
	public static void languageClick(String languageName) {
		
		
		List<WebElement> lang = driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
		System.out.println("The number of available lang are:  " + lang.size());
		
		for (int i = 0; i < lang.size(); i++) {
			String names = lang.get(i).getText();
			System.out.println(names);
			
			
			if (names.equalsIgnoreCase(languageName)) {
				lang.get(i).click();
				break;
			}
			
		}
		
	}

}
