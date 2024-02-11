package testNGPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExamTestNG 
{
	WebDriver driver;
	
	//chromedriver class >> webdriver interface >> takesscreenshot interface
			
	@Test
	public void examTest() throws IOException
	{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mouse");
		//List<WebElement> searchlist = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		List<WebElement> searchlist = driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']/form/ul/li"));
				
		searchlist.get(1).click();
		
		driver.findElement(By.xpath("(//div[@class='_13oc-S']/div/div)[2]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterate =handles.iterator();
		String childwindow =iterate.next();
		String parentwindow =iterate.next();
		driver.switchTo().window(parentwindow);
		driver.close();
		
		driver.switchTo().window(childwindow);

		TakesScreenshot ss = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\ss.png");
		File src = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);
		
		driver.close();

	}

}
