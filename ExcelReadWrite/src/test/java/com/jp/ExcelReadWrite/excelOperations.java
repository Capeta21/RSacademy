package com.jp.ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelOperations {

	public static void main(String[] args) throws IOException {

		FileInputStream FIS = new FileInputStream("C:\\Users\\cjamdap\\Desktop\\EXTERNAL SANITY.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);
		
		int sheet_c = workbook.getNumberOfSheets();
		for(int i=0;i<sheet_c;i++)
		{
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row first_row = row.next();
				Iterator<Cell> ce = first_row.cellIterator();
				int k=0;
				int column = 0;
				while(ce.hasNext())
				{
					if(ce.next().equals("1"))
					{
						column = k;
					}
					k++;
				}
				
				while(row.hasNext())
				{
					//System.out.println(k);
					Row r = row.next();
					Double x = r.getCell(column).getNumericCellValue();
					if(x.equals(9.0))
					{
						Iterator<Cell> cv = r.cellIterator();
						System.out.println(cv.next());
						while (cv.hasNext())
						{
						System.out.println(cv.next());
						}
					}
				}
			}
		}

	}

}
