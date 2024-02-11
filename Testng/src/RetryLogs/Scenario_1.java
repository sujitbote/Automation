package RetryLogs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Scenario_1 
{
	@DataProvider (name ="data1")
	public Object[][] dataProvide()
	{
		Object[][] obj = new Object[][] {{"10"}};
		
		return obj;
		
	}
	
	@DataProvider (name="data2")
	public Object[][] dataProv2()
	{
		Object[][] obj1 = new Object[1][1];
		
		obj1[0][0] = "sujit";
	

		return obj1;
		
	}
			

	
	@Test (retryAnalyzer=RetryLogsDemo.class, dataProvider="data1", invocationCount=2)
	public void case1(String a)
	{
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		
		dr.manage().window().maximize();
		
		WebElement search = dr.findElement(By.id("twotabsearchtextbox"));

		//WebElement search = dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(a);
		search.sendKeys(Keys.ENTER);
	}
	

}
