package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

			public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData.xlsx");    //open excel file
			
			XSSFSheet sheet = wb.getSheet("AA");                              //get sheet
			
			XSSFRow row = sheet.getRow(1);				//get row
			
			XSSFCell cell = row.getCell(0);				//get column
			
			String value = cell.getStringCellValue(); 
			System.out.println(value);
			
		
	}

}
