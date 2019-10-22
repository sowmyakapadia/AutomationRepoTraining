package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException 
	{
//		This "user.dir" will help get the project path on your local machine
	System.out.println(System.getProperty("user.dir"));
	
//	This shows the path till xls files
	String filepath=System.getProperty("user.dir")+"\\src\\filehandling\\TestData.xls";
	System.out.println(filepath);
	
//	Import FileInputStream>then add throws declaration 
//	
	FileInputStream file=new FileInputStream(filepath);
	HSSFWorkbook ws= new HSSFWorkbook(file);
//	this will show path till the sheet within workbook
	HSSFSheet sheet= ws.getSheet("Sheet1");
//	This will get the values stored
	HSSFRow row=sheet.getRow(0);
	HSSFCell cell=row.getCell(0);
	
	System.out.println(cell.getStringCellValue());
		}
	

}
