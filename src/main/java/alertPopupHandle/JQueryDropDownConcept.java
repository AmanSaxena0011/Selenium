package alertPopupHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownConcept {
	
	
// Single Value	
//	Multiple value
//	All Value

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		
		By allchoices = By.cssSelector("span.comboTreeItemTitle");
		
//		selectChoiceValues(allchoices, "All");
//		selectChoiceValues(allchoices, "choice 6 2 2","choice 6 2 1","choice 6","choice 6 2 1");
		selectChoiceValues(allchoices, "choice 6 2 1");
		
	}

	
	public static void selectChoiceValues(By locator,String... value) {
		
		try {
		List<WebElement> options = driver.findElements(locator);
		System.out.println(options.size());
		
		for (int i = 0; i < options.size(); i++) {
		String text = options.get(i).getText();
		System.out.println(text);
		
		
		if (!value[0].equalsIgnoreCase("All")) {
			for (int j = 0; j < value.length; j++) {
				if (text.equalsIgnoreCase(value[j])) {
					options.get(i).click();
					break;
				}
		}
		}
		else {
			for (int all = 0; all < options.size(); all++) {
				options.get(all).click();
			}
		}
		}
		 }
		catch (Exception e) {
		}	
		}
	
	}
	
