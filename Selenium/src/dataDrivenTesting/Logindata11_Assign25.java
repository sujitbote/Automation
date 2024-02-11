package dataDrivenTesting;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class Fetchdata11
{
	String username;
	String password;
	
	
	
	public String ExcelData(String username, String password) throws EncryptedDocumentException, IOException
	{
		FileInputStream filelocation = new FileInputStream("D:\\Eclipse Path\\selenium\\InputData\\DataSheet.xlsx");
		Workbook wb = WorkbookFactory.create(filelocation);
		
		username = wb.getSheet("test").getRow(2).getCell(0).getStringCellValue();
		this.username=username;
		String str = wb.getSheet("test").getRow(2).getCell(0).getStringCellValue();
		//NumberToTextConverter.toText(wb.getSheet("test").getRow(2).getCell(0).getNumericCellValue());
		
		password = wb.getSheet("test").getRow(2).getCell(1).getStringCellValue();
		
		this.password=password;
		
		//System.out.println(str);
		return str;
		
	}

}

public class Logindata11_Assign25 extends Fetchdata11
{
		
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		Logindata11_Assign25 ld = new Logindata11_Assign25();

		System.out.println(ld.ExcelData("a", "s"));
		System.out.println(ld.username);
		System.out.println(ld.password);

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email")).sendKeys(ld.username);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(ld.password);
		driver.findElement(By.id("signInSubmit")).click();
		
		//xpo, concentrix punchshil;mdi network gigaspce; 7768003084 smriti; ups tower 6, all state
		//explicite wait, fetchexceldata, calenrer, switchwindow
		
	}

}



