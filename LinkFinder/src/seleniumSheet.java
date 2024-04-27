import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver is an interface which declares method definations of chromedriver, gheckodriver, edgedriver
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		WebDriver driver3 = new SafariDriver();
		
		// Open link in browser driver instance
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		
		//Locators - 8
		driver.findElement(By.xpath(""));
		driver.findElement(By.id(""));
		driver.findElement(By.className(""));
		driver.findElement(By.tagName(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.name(""));
		
		//implicit wait implementation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	}

}
