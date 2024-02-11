package dataProvider_singleDimArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegPage2DimArray_Assign15 
{
	
	@DataProvider(name="data")
	public Object[][] setData()
	{
		
		return new Object[][] {{"sujit","Bote","Sujit123","Passs@123"},{"ram","ram","Ram123","Passs@123"},{"sham","sham","Sham123","Passs@123"}};
		
//		Object[][] obj = new Object[2][4];
//		
//		obj[0][0]="Sujit";
//		obj[0][1]="Bote";
//		obj[0][2]="Sujit123";
//		obj[0][3]="Pass@123";
//		
//		obj[1][0]="Sujit";
//		obj[1][1]="Bote";
//		obj[1][2]="Sujit123";x
//		obj[1][3]="Pass@123";/

		//return obj;
	}
	
	@Test(dataProvider="data")
	public void test1(String fn, String ln, String un, String pw)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys(fn);
		driver.findElement(By.id("lname")).sendKeys(ln);
		driver.findElement(By.id("Username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);

		
	}
	
	

}
