package com.swm.pageObjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div/div/form/button")
	@CacheLookup
	WebElement clickLogin;
	
	@FindBy(name="loginfmt")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="idSIButton9")
	@CacheLookup
	WebElement clickNextUN;
	
	@FindBy(name="passwd")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="idSIButton9")
	@CacheLookup
	WebElement clickNextPWD;
	
	@FindBy(xpath="//*[@id=\"confirmGroup\"]")
	@CacheLookup
	WebElement clickGRP;
	
	@FindBy(xpath="//*[@id=\"mainTablecontainer\"]/button")
	@CacheLookup
	WebElement clickNew;
	
	@FindBy(xpath="/html/body/div[8]/md-dialog/div[2]/form/div/div[1]/input")
	@CacheLookup
	WebElement setProdName;
	
	
	@FindBy(xpath="/html/body/div[8]/md-dialog/div[2]/form/div/div[2]/input")
	@CacheLookup
	WebElement setProdCode;
	
	
	@FindBy(xpath="/html/body/div[8]/md-dialog/div[3]/button[2]")
	@CacheLookup
	WebElement setProdSubmit;
	
	@FindBy(xpath="//*[@id=\"dialogContent_1\"]/div[3]/button[2]")
	@CacheLookup
	WebElement clickcreate;
	
	@FindBy(xpath="/html/body/div[8]/md-dialog/div[3]/button[1]")
			@CacheLookup
			WebElement CancelNew;
	
	
	@FindBy(name="searchText")
	@CacheLookup
	WebElement TypeSearch;
	
	@FindBy(xpath="//*[@id=\"mainTablecontainer\"]/form/div/div/button")
	@CacheLookup
	WebElement search;
	
	@FindBy(linkText="Sales Trial - Metasys ADS Lite-A")
	@CacheLookup
	WebElement select;
	
	//*[@id="productsList"]/div[2]/div/div[1]/div[3]/div/div[2]/button[1]
	@FindBy(xpath="//*[@id=\"productsList\"]/div[2]/div/div[1]/div[3]/div/div[2]/button[1]")
	@CacheLookup
	WebElement clickCopy;
	
	
	@FindBy(xpath="//*[@id=\"productsList\"]/div[2]/div/div[1]/div[5]/div/div/div/div[6]/select")
	@CacheLookup
	WebElement clickBase;
	
	@FindBy(xpath="//*[@id=\"productsList\"]/div[2]/div/div[1]/div[5]/div/div/div/div[5]/input")
	@CacheLookup
	WebElement unselect;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/button[3]")
	@CacheLookup
	WebElement clickPublish;
	
	
			@FindBy(xpath="/html/body/div[8]/md-dialog/div[3]/button[2]")
			@CacheLookup
			WebElement clickConfirm;
			
			
			@FindBy(xpath="/html/body/div[8]/md-dialog/md-dialog-actions/button[2]")
			@CacheLookup
			WebElement clickConfirmSecond;
			
			
			@FindBy(xpath="/html/body/div[4]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")
			@CacheLookup
			WebElement Back;
			
	
	public void clickLoginButton()
	{
		clickLogin.click();
	}
	
	public void setUserName(String Uname)
	{
		txtUserName.sendKeys(Uname);
	}
	
	public void clickNextButtonUN()
	{
		clickNextUN.click();
	}
	
	public void setPassword(String Pwd)
	{
		txtPassword.sendKeys(Pwd);
	}
	
	
	public void clickNextButtonPWD()
	{
		clickNextPWD.click();
	}
	
	public void setPubGrp()
	{
		clickGRP.click();
	}
	
	public void CreateNew()
	{
		clickNew.click();
		CancelNew.click();
	}
	
	public void setProdName(String cell)
	{
		setProdName.sendKeys(cell);
	}
	
	public void setProdCode(String cell)
	{
		setProdCode.sendKeys(cell);
	}
	
	public void setProdSubmit()
	{
		setProdSubmit.click();
	}
	
	public void submitProdName()
	{
		clickcreate.click();
	}
	
	public void search()
	{
		try {
			  TypeSearch.click();
				System.out.println("Kya yaha");
				TypeSearch.sendKeys("ST-MS-ADSLA");
				
				search.click();
				System.out.println("now hereeeee");		
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			
			TypeSearch.click();
			System.out.println("Kya yaha yaha");
			TypeSearch.sendKeys("ST-MS-ADSLA");
			
			search.click();
			System.out.println("now hereeeee");	
		}
	}
	
	public void selectProd()
	{
		select.click();
	}
	
	public void clickBP(String BP,WebDriver driver) throws InterruptedException
	{
		int index;
		
		if(BP.equals("NA"))
		{
			unselect.click();
		}else 
		{
			Thread.sleep(6000);
		Select s = new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div/div[6]/select")));
		System.out.println("Yamla"+(s.getOptions().size()));
				List<WebElement> DrpDownList=s.getOptions();
				
				for(int i=0;i<DrpDownList.size();i++ )
				{
					
					String Dead = DrpDownList.get(i).getText();
					System.out.println("convert"+Dead);
					
				    if((BP).equalsIgnoreCase(Dead))
				    {
				    	index = i;
				    	s.selectByIndex(index);
				    	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%index"+index);
				    	break;
				    }
				}				
		}
	}
	
	public void clickCopy()
	{
		clickCopy.click();
	}
	
	public void clickPublish()
	{	
		clickPublish.click();
		
	}
	
	@SuppressWarnings("finally")
	public boolean clickConfirm()
	{
		System.out.println("arrrrrrrrrr");
		boolean result = false;
		try {
			System.out.println("&&&&&&&true");
		clickConfirm.click();
		
		result= true;
		
	}catch(NoSuchElementException MSEE){
		System.out.println("&&&&&&&false");
	    MSEE.printStackTrace();
	    
	    result= false;
	}
		
		finally {
			
			System.out.println("&&&&&&finally"+result);
			return result;
		}
	}
	
	
	public void clickConfirmSecond()
	{
		clickConfirmSecond.click();
	}
	
	public void BackClick()
	{
		Back.click();
	}
	
	public void waitForLoginButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		
	}
	public void waitForUsernamField(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait1=new WebDriverWait(driver, 800);
		//Thread.sleep(8000);
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"i0116\"]"))));
	}
	public void waitForPassWordField(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 620);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("passwd"))));
	}
	
	
	public void waitForPubGrpField(WebDriver driver) throws InterruptedException
	{	
		Thread.sleep(9000);
	}
	
	
	public void waitForCreateNewProd(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 420);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"mainTablecontainer\"]/button"))));
	}
	
	public void waitForSubmitPName(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 620);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\\\"dialogContent_1\\\"]/div[3]/button[2]"))));
	}
	
	
	public void waitForSearch(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(12000);
	}
	
	public void waitForResult(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 820);
		Thread.sleep(5000);
	}
	public void waitForCopyProd(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\\\"dialogContent_1\\\"]/div[3]/button[2]"))));
	}
	
	public void waitForConfirm(WebDriver driver) throws InterruptedException
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 620);
		Thread.sleep(6000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\\\"dialogContent_1\\\"]/div[3]/button[2]"))));
	}
	
	
}
