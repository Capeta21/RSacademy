package com.swm.testCases;

import java.io.FileInputStream;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import com.swm.pageObjects.LoginPage;
import java.util.*;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public boolean loginTest(int r, String strValue, String strValue1, String strValue2, WebDriver driver1) throws InterruptedException, IOException
	{
		LoginPage LP = new LoginPage(driver1);
		System.out.println("*********"+strValue2);
       
		driver1.get(baseURL);
				
		logger.info("URL is open");
		LP.waitForLoginButton(driver1);
		LP.clickLoginButton();
		
		logger.info("Sign In page is open");
		LP.waitForUsernamField(driver1);
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));
		
		LP.setUserName(UserName);
		LP.clickNextButtonUN();
		
		LP.waitForPassWordField(driver1);
		LP.setPassword(PassWord);		
		LP.clickNextButtonPWD();
		
		LP.waitForPubGrpField(driver1);
		LP.setPubGrp();
		LP.waitForSearch(driver1);
		
		//LP.waitForCreateNewProd(driver1);
		//LP.CreateNew();
	
		
	            System.out.println("******** Row:"+r);	  
	            LP.search();
			  	LP.waitForResult(driver1);
			  	LP.selectProd();
			  
				LP.waitForCopyProd(driver1);
				LP.clickCopy();
				LP.waitForCopyProd(driver1);
				
	            
	                
	                
	                System.out.println("this is a value"+strValue);
	                
	                LP.setProdName(strValue);
	               
	               
	                LP.setProdCode(strValue1);
	                LP.waitForConfirm(driver1);
	                LP.setProdSubmit();
	                
	                LP.waitForCopyProd(driver1);
					LP.clickBP(strValue2,driver1);
					
	                LP.waitForCopyProd(driver1);
	                LP.waitForCopyProd(driver1);
	                LP.clickPublish();
	                  LP.waitForConfirm(driver1);
	                  
	                  
		                boolean HOT = (boolean)LP.clickConfirm();		                
		                if(HOT ==true) {
		                LP.waitForCopyProd(driver1);
		                LP.clickConfirmSecond();
		                LP.waitForCopyProd(driver1);
		               
	                  }
						else {
	              	  System.out.println(strValue+" Fail");
	                  }
		                driver1.quit();
						return HOT;
						
//		if(driver1.getTitle().equals("Johnson Controls Sales Support Portal"))
//		{
//			Assert.assertTrue(true);
//			logger.info("Login Test is passed");
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			logger.info("Login Test is failed");
//		}
	
	}
}
