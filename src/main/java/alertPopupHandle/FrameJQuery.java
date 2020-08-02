package alertPopupHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameJQuery {
	 static public WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		driver.findElement(By.id("draggable")).isDisplayed();
		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[4]/a")).click();
	
		
	}

}
