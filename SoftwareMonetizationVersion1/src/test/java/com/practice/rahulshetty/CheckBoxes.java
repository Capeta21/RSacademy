package com.practice.rahulshetty;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.swm.testCases.BaseClass;

	public class CheckBoxes extends BaseClass {
		
		@Test
		public static void DropTest() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
			driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
			
			List<WebElement> Total_Checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
			
			int NumbeOfCheckboxes = Total_Checkboxes.size();
			System.out.println("Number Of Checkboxes present on the screen:" + NumbeOfCheckboxes);
			
			}

}
