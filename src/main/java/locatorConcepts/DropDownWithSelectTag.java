package locatorConcepts;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {
	
	static WebDriver driver;
	
//	selectByVisibleText
//	selectByindex
//	selectByValue
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement Day = driver.findElement(By.id("day"));
		Select select = new Select(Day);
		select.selectByVisibleText("10");
		select.selectByIndex(5);
		select.selectByValue("17");
		
		
		WebElement Month = driver.findElement(By.id("month"));
		Select select1 = new Select(Month);
		select1.selectByVisibleText("Nov");
	
		
	}

}
