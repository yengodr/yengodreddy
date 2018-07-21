package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusEx {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("hyd");
	}
	

}
