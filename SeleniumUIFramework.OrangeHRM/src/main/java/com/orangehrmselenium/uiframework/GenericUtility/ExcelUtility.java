package com.orangehrmselenium.uiframework.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	 Workbook wb;
	 Sheet sh;
	
	//load Excel
	public void loadExcelFile(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
         wb = WorkbookFactory.create(fis);
         sh = wb.getSheet(sheetName);
         System.out.println();

	}

//
//	public String getDataFromSingleCell(int rowNum, int cellNum) {
//
//		 CellType data=sh.getRow(rowNum).getCell(cellNum).getCellType();
//		   
//	    String value = "";
//
//	    if (data == CellType.STRING) {
//	        value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
//	    }
//	    else if (data == CellType.NUMERIC) {
//	    	value = String.valueOf((int) sh.getRow(rowNum).getCell(cellNum).getNumericCellValue());
//	    }
//	   
//
//	    return value;  
//	}
//    
//    //Write Data
//    public void writeDataIntheCell(String filepath,String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException {
//    	FileInputStream fis=new FileInputStream(filepath);
//    	Workbook wb=WorkbookFactory.create(fis);
//    	Sheet sheet=wb.getSheet(sheetName);
//    	Row row=sheet.getRow(rowNum);
//    	if(row==null) {
//    		row=sheet.createRow(rowNum);
//    	}
//    	Cell cell=row.getCell(cellNum);
//    	if(cell==null) {
//    	cell=row.createCell(cellNum);
//    }
//    	cell.setCellValue(data);
//    	FileOutputStream fos=new FileOutputStream(filepath);
//    	wb.write(fos);
//    	fos.close();
//    }
//	
//
//	
//	//Get entire data using Data provider
//	public Object[][] getDataFromTheExcelSHeet() throws IOException{
//		int rowNo=sh.getLastRowNum();
//		int columnNo=sh.getRow(0).getLastCellNum();
//		
//		Object[][] data =new Object[rowNo][columnNo];
//		for(int i=1;i<=rowNo;i++) {
//			for(int j=0;j<columnNo;j++) {
//				data[i-1][j]=getDataFromSingleCell(i,j);
//				
//			}
//		}
//		return data;
//	}
//
//
	public String getDataFromSingleCell(int rowNum, int cellNum) {

	    if (sh == null) {
	        return "";
	    }

	    if (sh.getRow(rowNum) == null) {
	        return "";
	    }

	    if (sh.getRow(rowNum).getCell(cellNum) == null) {
	        return "";
	    }

	    CellType data = sh.getRow(rowNum).getCell(cellNum).getCellType();

	    String value = "";

	    if (data == CellType.STRING) {
	        value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
	    } 
	    else if (data == CellType.NUMERIC) {
	        value = String.valueOf((int) sh.getRow(rowNum).getCell(cellNum).getNumericCellValue());
	    }

	    return value;
	}
}