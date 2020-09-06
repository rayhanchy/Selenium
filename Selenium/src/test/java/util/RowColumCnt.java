package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowColumCnt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData.xlsx");    //open excel file
		
		XSSFSheet sheet = wb.getSheet("AA");                              //get sheet
		
		int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
		int columcount = sheet.getRow(0).getLastCellNum();
			System.out.println(columcount);
		
		
		
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i); //get row
			
			for (int j = 0; j <columcount; j++) {
				XSSFCell cell = row.getCell(j); //get column
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
	
	}	
}
