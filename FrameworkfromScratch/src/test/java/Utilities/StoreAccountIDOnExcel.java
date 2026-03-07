package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.ConstantsData;

public class StoreAccountIDOnExcel {
	
	
	public static void storeAccID(int rowNum, int cellNum, String data) throws IOException
	{
		
		FileInputStream fs = new FileInputStream(ConstantsData.Store_AccountID_Excel_PATH);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
	
		
		
		if (sheet.getRow(rowNum) == null) {
	        sheet.createRow(rowNum);
	    }

	   
	    if (sheet.getRow(rowNum).getCell(cellNum) == null) {
	        sheet.getRow(rowNum).createCell(cellNum);
	    }

	    sheet.getRow(rowNum).getCell(cellNum).setCellValue(data);

	    fs.close();  

	    FileOutputStream fos = new FileOutputStream(ConstantsData.Store_AccountID_Excel_PATH);
	    workbook.write(fos);

	    workbook.close();
	    fos.close();
	}
		
	
	
	
	
}
