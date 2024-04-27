import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		List<WebElement> bom = driver.findElements(By.xpath("//a"));
		System.out.println("total : "+bom.size());
		List<String> linknames = new ArrayList<String>();
		
		for(WebElement link : bom)
		{
			String url = link.getAttribute("href");
			linknames.add(link.getText());
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int x = conn.getResponseCode();
			if(x > 400)
			{
				System.out.println(link);
				System.out.println(link.getText());
				System.out.println("response code is "+x+" for broken link "+url);
			}
		}
		
		linknames.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println("Links start with A : "+s));
	}
}
