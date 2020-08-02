package webelements;

public class HubSpotLoginPage {
	

	static String browser = "Chrome";
	static String URL = "http://app.hubspot.com/login";

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDrivermethods obj = new WebDrivermethods();
		obj.LauchBrowser(browser);
		obj.launchURL(URL);
		
		Thread.sleep(5000);
		
		String title = obj.getPageTitle();
		System.out.println("page title is: " + title);
		
		obj.closeBrowser();
		
	}

}
