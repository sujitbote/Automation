package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class Fetch_Excel_Data {
//	public static String un;
//	public static String pwd;
//	
//	public static void fetchValue() throws EncryptedDocumentException, IOException
//	{
//		FileInputStream filepath = new FileInputStream("C:\\Users\\Shree\\eclipse new version workplace\\Demo\\amazon_test\\TestData.xlsx");
//		Workbook file = WorkbookFactory.create(filepath);
//		un = file.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		pwd = file.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//	}

	@DataProvider(name = "data1")
	public static Object[][] getData() throws EncryptedDocumentException, IOException {
		FileInputStream filepath = new FileInputStream(
				"C:\\Users\\Shree\\eclipse new version workplace\\Demo\\amazon_test\\data.xlsx");
		Workbook file = WorkbookFactory.create(filepath);
		Sheet sheet = file.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] testdata = new Object[rowcount - 1][cellcount];

		for (int i = 1; i < rowcount; i++) {

			for (int j = 0; j < cellcount; j++) {

				{
					testdata[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
		}

		return testdata;
	}
//	Row row = sheet.getRow(i);
//	Cell username = row.getCell(0);
//	Cell password = row.getCell(1);
//	testdata[i-1][0] = username.getStringCellValue();
//	testdata[i-1][1] = password.getStringCellValue();

}
