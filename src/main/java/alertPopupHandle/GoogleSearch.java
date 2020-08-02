package alertPopupHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		List<WebElement> searchoptions = driver.findElements(By.xpath("//ul[@class = \'erkvQe\']/li//span"));
		for (int i = 0; i < searchoptions.size(); i++) {
		String text = searchoptions.get(i).getText();
			System.out.println(text);
			Thread.sleep(10000);
			if (searchoptions.get(i).getText().equalsIgnoreCase("selenium python")) {
				searchoptions.get(i).click();
				
			}
			
			
		}	}

	}

