package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldatpv {
	
	public String[][] readexcel () throws IOException {

	

		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData.xlsx");    //open excel file
														//XSSFSheet sheet = wb.getSheet("AA");
		XSSFSheet sheet = wb.getSheetAt(0);                              //get sheet
		
		int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
		int columcount = sheet.getRow(0).getLastCellNum();
			System.out.println(columcount);
		
			String [][] data = new String [rowcount][columcount];
		
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i); //get row
			
			for (int j = 0; j <columcount; j++) {
				XSSFCell cell = row.getCell(j); //get column
				String value = cell.getStringCellValue();
				System.out.println(value);
				
				data [i-1][j] = value;
				
				
			}
		}
		
		return data;
	
	}	

	}


