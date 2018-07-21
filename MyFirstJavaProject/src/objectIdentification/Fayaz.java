package objectIdentification;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fayaz {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.get("http://redbus.in");
        driver.findElement(By.id("src")).sendKeys("hyderabad");
        driver.close();
        
}
}