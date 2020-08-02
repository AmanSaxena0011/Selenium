package locatorConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {
	static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Country =  By.id("Form_submitForm_Country");
		
		
		WebElement CountEle = driver.findElement(Country);
		
		Select select = new Select(CountEle);
		List<WebElement> CountList = select.getOptions();
		
		System.out.println(CountList.size());
		
		for (int i = 0; i < CountList.size(); i++) {
			String text = CountList.get(i).getText();
			System.out.println(text);
		}
		

	}

}
