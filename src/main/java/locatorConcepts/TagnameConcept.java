package locatorConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameConcept {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");

//		get the total number of links available on amazon
//		get the printed
//		Ignore the blank link
		
	
		
		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		System.out.println("Total number of available link are: " + LinkList.size());
		
		for (int i = 0; i < LinkList.size(); i++) {
			String Text = LinkList.get(i).getText();
			
			
			if (!Text.isEmpty()) {
				System.out.println(Text);	
			}
			
		}
	}}
		
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
