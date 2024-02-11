package crossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo 
{
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void testCase1(String nameofbrowser)
	{
		
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

		//WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}
	

}
