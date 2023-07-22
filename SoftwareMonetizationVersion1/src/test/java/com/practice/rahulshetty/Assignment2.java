package com.practice.rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.swm.testCases.BaseClass;

public class Assignment2 extends BaseClass {
	@Test
	public static void fillForm() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("name")).sendKeys("Amit");
	driver.findElement(By.name("email")).sendKeys("amit@gmail.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("@mi2");
	driver.findElement(By.id("exampleCheck1")).click();
	driver.findElement(By.id("exampleFormControlSelect1")).click();
	Select s = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
	s.selectByVisibleText("Male");
	driver.findElement(By.id("inlineRadio1")).click();
	driver.findElement(By.xpath("//input[@xpath='1']")); 
	}

}
