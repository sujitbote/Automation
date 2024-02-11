package testNGPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo 
{
	
	@Test
	public void actiontest() throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\demo.png");
		
		FileUtils.copyFile(src, dest);
		
//		WebElement search =driver.findElement(By.linkText("Gmail"));
//
//		Actions a1 = new Actions(driver);
//		a1.contextClick(search).build().perform();
//		a1.sendKeys(Keys.ARROW_DOWN).build().perform();
//		a1.sendKeys(Keys.ARROW_DOWN).build().perform();
//		a1.sendKeys(Keys.ARROW_DOWN).click().perform();

		
		
	}

}
