package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		
		WebElement menulink = driver.findElement(By.className("menulink"));
		Actions ac = new Actions(driver);
		ac.moveToElement(menulink).perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}
