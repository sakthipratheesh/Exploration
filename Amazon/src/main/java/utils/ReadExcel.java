package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {

	String[][] data;
	@DataProvider(name="userInput")
	public String[][] getExcelData() {
		try {
			String fileLocation="./test-data/TC001.xlsx";
			XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); 
			XSSFSheet sheet= wbook.getSheetAt(0);
			int rowsCount=sheet.getLastRowNum();
			int cellCount=sheet.getRow(0).getLastCellNum();
			System.out.println("Row count :"+rowsCount);
			System.out.println("Cell count:"+cellCount);
			data=new String[rowsCount][cellCount];
			//System.out.println(dataRowsCount);
			for (int i = 1; i <=rowsCount; i++) {
				XSSFRow row=sheet.getRow(i);
				for (int j = 0; j < cellCount; j++) {
					XSSFCell cell=row.getCell(j);
					DataFormatter dft=new DataFormatter();
					String value = dft.formatCellValue(cell);
					//String value = cell.getStringCellValue();
					System.out.println(value);
					if(value!="") {
						data[i-1][j]=value;
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;


	}

	/*
	 *

		public static void main(String[] args) {
		try {
			String fileLocation="./test-data/TestData.xlsx";
			XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); 
			XSSFSheet sheet= wbook.getSheetAt(0);
			int dataRowsCount=sheet.getLastRowNum();
			int cellCount=sheet.getRow(0).getLastCellNum();
			//System.out.println(dataRowsCount);
			for (int i = 1; i <=dataRowsCount; i++) {
				XSSFRow row=sheet.getRow(i);
				for (int j = 0; j < 3; j++) {
					XSSFCell cell=row.getCell(j);
					DataFormatter dft=new DataFormatter();
					String value = dft.formatCellValue(cell);
					//String value = cell.getStringCellValue();
					System.out.println(value);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
		String[][] data;
	@DataProvider(name="userInput")
	public String[][] getExcelData() {
		try {
			String fileLocation="./test-data/TestData.xlsx";
			XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); 
			XSSFSheet sheet= wbook.getSheetAt(0);
			int rowsCount=sheet.getLastRowNum();
			int cellCount=sheet.getRow(0).getLastCellNum();
			System.out.println("Row count :"+rowsCount);
			System.out.println("Cell count:"+cellCount);
			data=new String[rowsCount-1][cellCount];
			//System.out.println(dataRowsCount);
			for (int i = 1; i <=rowsCount; i++) {
				XSSFRow row=sheet.getRow(i);
				for (int j = 0; j < cellCount-1; j++) {
					XSSFCell cell=row.getCell(j);
					DataFormatter dft=new DataFormatter();
					String value = dft.formatCellValue(cell);
					//String value = cell.getStringCellValue();
					System.out.println(value+""+i+""+j);
					if(value!="") {
						data[i-1][j]=value;
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;


	}
	 */
}
