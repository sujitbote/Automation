package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeClass 
{
	public void test()
	{
		WebDriver driver = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement wb =driver.findElement(By.xpath(""));
		
		js.executeScript("arguments[0].ScrollIntoView();", wb);
		
		
		
	}

	
	
	

}
