package alertPopupHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delete {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		
		By allchoice = By.cssSelector("span.comboTreeItemTitle");
//		getallclick(allchoice, "choice 1");
//		getallclick(allchoice, "choice 1", "choice 2");
		getallclick(allchoice, "All");
	}
	
	public static void getallclick(By locator,String... value) {
		

		try {
			List<WebElement> options = driver.findElements(locator);
			
			for (int i = 0; i < options.size(); i++) {
				String text = options.get(i).getText();
				System.out.println(text);
				
				if(!value[0].equalsIgnoreCase("All")) {
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
