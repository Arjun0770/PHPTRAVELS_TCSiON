package com.phptravels.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Util{
	private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWsheet;
	 
	 public static String getCellValue(String SheetName, int RowNum1,int ColNum1) throws IOException
	 {
		// FileInputStream ExcelFile1 = new FileInputStream("/Users/arjun/Software Testing/PHP_travels/src/main/resources/TestData.xlsx");
		FileInputStream ExcelFile1=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/TestData.xlsx");

		 excelWBook=new XSSFWorkbook(ExcelFile1);
		 excelWsheet = excelWBook.getSheet(SheetName);
		 return excelWsheet.getRow(RowNum1).getCell(ColNum1).getStringCellValue();
	 }
}
