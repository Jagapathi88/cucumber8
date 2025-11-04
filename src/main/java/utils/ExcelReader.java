package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static void readExcel() throws InvalidFormatException, IOException {

	File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\testData.xlsx");
	FileInputStream src = new FileInputStream(f);
	XSSFWorkbook workBook = new XSSFWorkbook(f);
	XSSFSheet sheet = workBook.getSheetAt(0);
	int rows= sheet.getPhysicalNumberOfRows();
	System.out.println(rows);
	int columns = sheet.getRow(0).getLastCellNum();
	System.out.println(columns);
	
	List<String> list1 = new ArrayList<String>();
	String[][]s = new String[rows][columns];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			s[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(s[i][j]);
		}
	}
	for(String s1[] : s)
	{
		for(String s2 : s1)
		{
			System.out.println(s2);
		}
	}
	
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		readExcel();
	}
}
