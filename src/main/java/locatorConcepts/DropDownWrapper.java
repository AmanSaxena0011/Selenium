package locatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWrapper {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");


		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		doSelectValueByVisibleText(day, "27");
		doSelectValueByIndex(month, 2);
		doSelectValueByValue(year, "2020");
		
	}
	
	public static void  doSelectValueByVisibleText(By locator,String Value) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(Value);
	}	
		
		public static void  doSelectValueByIndex(By locator,int Index) {
			Select select = new Select(driver.findElement(locator));
			select.selectByIndex(Index);
		}
			
			public static void  doSelectValueByValue(By locator,String Value) {
				Select select = new Select(driver.findElement(locator));
				select.selectByValue(Value);
			}
	
	public static WebElement getElement (By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

}
