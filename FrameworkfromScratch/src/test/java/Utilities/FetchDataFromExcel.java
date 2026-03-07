package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.ConstantsData;

public class FetchDataFromExcel {
	
	public static String getURL(int x, int y) throws IOException
	{
		
		FileInputStream fs = new FileInputStream(ConstantsData.EXCEL_PATH);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell val =sheet.getRow(x).getCell(y);
		
		String URL = val.toString();
		return URL;
		
		
	}
	
	
	public static String FetchCustomerIDFromExcel (int x, int y) throws IOException {
		FileInputStream fs1 = new FileInputStream(ConstantsData.Store_CustID_Excel_PATH);
		XSSFWorkbook workbook1 = new XSSFWorkbook(fs1);
		XSSFSheet sheet1 = workbook1.getSheetAt(0);
		XSSFCell val1 =sheet1.getRow(x).getCell(y);
		
		return val1.toString();
		
		
	}
	
	
	
	
	}


