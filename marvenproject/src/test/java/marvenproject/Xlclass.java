package marvenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlclass {
private static final String STRING = null;

public static void main(String[] args) throws IOException {
	
	
	File file = new File ("C:\\Users\\PANDI\\eclipse-workspace\\marvenproject\\XL datas\\Xl data.xlsx");
	
	FileInputStream stream = new FileInputStream (file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Excel data");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
	String CellValue = cell.getStringCellValue();
	
//	//switch (CellValue) {
//	case STRING:
//		
//		break;
//
//	default:
//		break;
//	}
//	System.out.println("*************************");
	}}}
}
