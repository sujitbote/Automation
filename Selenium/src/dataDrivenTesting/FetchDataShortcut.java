package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class FetchDataShortcut 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream fn = new FileInputStream("D:\\Eclipse Path\\selenium\\InputData\\DataSheet.xlsx");
		Workbook wb =WorkbookFactory.create(fn);
		
		String value1 =wb.getSheet("test").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		String value2 =NumberToTextConverter.toText(wb.getSheet("test").getRow(1).getCell(2).getNumericCellValue());
		System.out.println(value2);
		
		

	}

}
