package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream filePath = new FileInputStream("D:\\Eclipse Path\\selenium\\InputData\\DataSheet.xlsx"); //step-1= let client know excel sheet location
		
		Workbook openExcel = WorkbookFactory.create(filePath); //step-2= open excel sheet
		
		Sheet excelSheet = openExcel.getSheet("test"); //step-3= fetch excel sheet
		
		Row r1 =excelSheet.getRow(1); //step-4= fetch row 
		
		Cell c1 =r1.getCell(0); //step-5= fetch cell/column 
		
		String data =c1.getStringCellValue(); //step-6= call the fetched data
		
		System.out.println(data);
		

	}

}
