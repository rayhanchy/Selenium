package seleniumPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltetsing {

	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
		//go to the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(1);
		
		//read value
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
		
		
	}

}
