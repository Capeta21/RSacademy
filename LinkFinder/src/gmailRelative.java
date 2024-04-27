import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class gmailRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement dr = driver.findElement(By.xpath("//textarea"));
		driver.findElement(with(By.tagName("a")).below(dr)).click();
		
	}

}
