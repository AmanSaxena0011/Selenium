package locatorConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelect {

	static WebDriver driver;
	static String dob = "18-Nov-2011";
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://facebook.com");

		By dayOptions =   By.xpath("//select[@id=\"day\"]/option");
		By monthOptions = By.xpath("//select[@id=\"month\"]/option");
		By yearOptions =  By.xpath("//select[@id=\"year\"]/option");
		
		getdropdownselected(dayOptions,dob.split("-")[0]);
		getdropdownselected(monthOptions,dob.split("-")[1]);
		getdropdownselected(yearOptions,dob.split("-")[2]);
		
	}
public static void getdropdownselected(By locator,String value) {
	List<WebElement> DayOption = driver.findElements(locator);
//	System.out.println(DayOption.size());
	
	for (int i = 0; i < DayOption.size(); i++) {
		String Text = DayOption.get(i).getText();
//		System.out.println(Text);
		if (Text.equals(value)) {
			DayOption.get(i).click();
			break;
		}

	}
}
}
