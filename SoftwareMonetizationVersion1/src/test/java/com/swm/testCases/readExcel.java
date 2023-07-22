package com.swm.testCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readExcel extends BaseClass{
	
	    @Test
	    public void readData()  throws IOException, InterruptedException {
	        
	    	String excelpath = "C:\\Users\\cjamdap\\Downloads\\ProdP.xlsx";
	        FileInputStream inputstream = new FileInputStream(excelpath);
	        
	        System.out.println("hello excel");
	        @SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	        XSSFSheet sheet = workbook.getSheet("Level1");
	        
	        // Using for loop
	        
	        int rows = sheet.getLastRowNum();
	        
	        try {
			  for(int r=1; r<=rows; r++) 
			  {
				  WebDriver driver1 = new ChromeDriver();
				  XSSFRow row=sheet.getRow(r);
	                
	                XSSFCell cell=row.getCell(0);
	                DataFormatter formatter = new DataFormatter();
	                String strValue = formatter.formatCellValue(cell);
	                XSSFCell cell1=row.getCell(1);
	                String strValue1 = formatter.formatCellValue(cell1);
	                XSSFCell cell2=row.getCell(2);
	                String strValue2 = formatter.formatCellValue(cell2);
	                System.out.println("*********"+strValue2);
	                TC_LoginTest_001 TCL = new TC_LoginTest_001();
	                boolean ME = TCL.loginTest(r, strValue, strValue1,strValue2, driver1);
	                XSSFCell cell3=row.getCell(3);
	                System.out.println("before:"+cell3);
	                cell3.setCellValue(ME);
	                System.out.println("after:"+cell3);
	                FileOutputStream fos = new FileOutputStream(excelpath);
	  			  workbook.write(fos);
	               
			  }
	        }catch(NullPointerException ex) {
	        	ex.printStackTrace();
	        }
			  
			  FileOutputStream fos = new FileOutputStream(excelpath);
			  workbook.write(fos);
			  fos.close();
			
			
	        
	    }

}
