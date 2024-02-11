package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormattedTC 
{
	ChromeDriver a1;
	
	@BeforeMethod
	void precondition()
	{
		System.out.println("this is precondition");
		
		a1 = new ChromeDriver();
		a1.get("https://www.google.in");
		a1.manage().window().maximize();
	}
	
	@Test
	void mainLogic1() throws InterruptedException
	{
		System.out.println("this is logic-1");
		
		a1.findElement(By.id("APjFqb")).sendKeys("india");
		a1.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@Test
	void mainLogic2() throws InterruptedException
	{
		System.out.println("this is logic-2");
		
		a1.findElement(By.id("APjFqb")).sendKeys("maharashtra");
		a1.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@Test
	void mainLogic3()
	{
		System.out.println("this is logic-3");
		
		
	}
	
	@AfterMethod
	void postActivity()
	{
		System.out.println("this is postactivity");
		
		//a1.navigate().refresh();
		a1.quit();

	}

}
