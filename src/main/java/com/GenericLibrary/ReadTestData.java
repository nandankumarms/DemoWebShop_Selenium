package com.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTestData implements FrameworkConstants {
	public static String[][] readExcelData(String sheetName) throws EncryptedDocumentException, IOException {
		File file=new File(EXCEL_PATH);
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet(sheetName);
		
		int row=sheet.getPhysicalNumberOfRows();//4
		int col=sheet.getRow(0).getPhysicalNumberOfCells();//1
		String[][] data=new String[row-1][col];//3:1
		for(int i=1;i<row;i++) {//1:3
			for(int j=0;j<col;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

}
