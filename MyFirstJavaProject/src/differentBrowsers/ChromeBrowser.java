package differentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.close();
		
	}
}
