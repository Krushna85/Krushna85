package com.utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;

public class DataProviderss extends NewExcelLibrary {

	public DataProviderss() throws IOException {
		super();
	}

	NewExcelLibrary excel = new NewExcelLibrary();

	@DataProvider(name = "userCredentials")
	public Object[][] getUserCredentials() throws Exception {

		XSSFSheet sheet = wb.getSheet("userCredentials");
		int rowCount = sheet.getLastRowNum();
		int colCount = 2;
		Object[][] dataObj = new Object[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				int rowNum = i;
				rowNum--;
				dataObj[rowNum][j] = row.getCell(j).toString();
			}
		}
		return dataObj;
	}

	@DataProvider(name = "userRegistrationData")
	public Object[][] getUserRegistrationData() throws Exception {

		XSSFSheet sheet = wb.getSheet("userRegistrationData");
		int rowCount = sheet.getLastRowNum();
		int colCount = 8;
		Object[][] dataObj = new Object[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				int rowNum = i;
				rowNum--;
				dataObj[rowNum][j] = row.getCell(j).toString();
			}
		}
		return dataObj;
	}

}
