package xPath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnCricInfo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1187007/india-vs-south-africa-1st-test-icc-world-test-championship-2019-2021");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		getBowlerName("CA Pujara");
		getScoreCard("CA Pujara");
					
	}
	
	public static void getBowlerName(String batsmanname) {
		String name = driver.findElement(By.xpath("(//a[text()='"+batsmanname+"'])[1]")).getText();
		System.out.println("Player name is: "+ name);
		String bowlername =  driver.findElement(By.xpath("(//a[text()='"+batsmanname+"'])[1]/..//following-sibling::td/span/span")).getText();
		System.out.println("The bowler who bowled him out is: " +bowlername);
		
	}
	
	public static void getScoreCard(String batsmanname) {
		List<String> detailArray = new ArrayList<String>();
		List<WebElement> details=  driver.findElements(By.xpath("(//a[text()='"+batsmanname+"'])[1]/..//following-sibling::td//following-sibling::td"));
		System.out.println("The score card is below  ");
		
		for (int i = 0; i < details.size(); i++) {
			String text = details.get(i).getText();
			detailArray.add(text);
		}
			System.out.println(detailArray);
	
	}

}
