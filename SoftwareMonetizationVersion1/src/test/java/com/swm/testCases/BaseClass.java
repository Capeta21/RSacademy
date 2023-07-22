package com.swm.testCases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://jcibts-swm-qa2.jci.com/publisherportal/#/login";
	public String UserName = "prashpublisher@testswm.com";
	public String PassWord = "B5F4soft@@";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.out.println("----------------------------");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cjamdap\\Desktop\\Welcome\\MyProj\\eclipse\\SoftwareMonetizationVersion1\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//driver = new ChromeDriver();
		logger = Logger.getLogger("SoftwareMonetization");
		PropertyConfigurator.configure("Log4j.properties");
	}
		
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
}
