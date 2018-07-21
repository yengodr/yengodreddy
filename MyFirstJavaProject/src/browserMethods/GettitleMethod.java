package browserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettitleMethod {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Pass");
			
		}
		else{
			System.out.println("Fail");
		}
		
	}

}
