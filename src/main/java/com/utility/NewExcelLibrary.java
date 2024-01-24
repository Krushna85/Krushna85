package com.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelLibrary {
	public static String path = System.getProperty("user.dir") + "\\ExcelData\\TestData.xlsx";

	public FileInputStream fis;
	public FileOutputStream fileOut;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	public NewExcelLibrary() throws IOException {
		String path = System.getProperty("user.dir") + "\\ExcelData\\TestData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
	}

	public String getStringData(String SheetName, int row, int cell) {
		String StringValue = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return StringValue;
	}

	public Boolean getBooleanData(String SheetName, int row, int cell) {
		boolean BooleanValue = wb.getSheet(SheetName).getRow(row).getCell(cell).getBooleanCellValue();
		return BooleanValue;
	}

//	// returns the row count in a sheet
//	public int getRowCount(String SheetName) {
//		int rowCount = wb.getSheet(SheetName).getLastRowNum() + 1;
//		return rowCount;
//	}

//	public int geCellCount(String SheetName) {
//		int cellCount = wb.getSheet(SheetName).getRow(row).getLastCellNum();
//		return cellCount;
//	}

}
