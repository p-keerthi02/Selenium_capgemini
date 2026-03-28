package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void Test() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\OrangeHRM TestScript Data\\vacancyData (2).xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("addvacancy");
		int last=sheet.getLastRowNum();
//		for(int i =1;i<4;i++) {
//		Row row=sheet.getRow(i);
//		Cell cell = row.getCell(1);
//		String vaccancyName = cell.getStringCellValue();
//		System.out.println(vaccancyName);
//		}
//		for(int i =0;i<4;i++) {
//			String vaccancyName = sheet.getRow(i).getCell(1).getStringCellValue();
//			System.out.println(vaccancyName);
//			}
		for(int i =0;i<last;i++) {
			String vaccancyName = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(vaccancyName);
			}
		workbook.close();
	}

}
