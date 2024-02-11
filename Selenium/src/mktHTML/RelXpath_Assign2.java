package mktHTML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelXpath_Assign2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		dr.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("sujitbote42");
		dr.findElement(By.xpath("//input[@name='say hello']")).sendKeys("my name");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("Sujit@1");
		dr.findElement(By.xpath("//input[@name='fname']")).sendKeys("sujit");
		dr.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("//input[@value='Boy']")).click();
		dr.findElement(By.xpath("//input[@value='Girl']")).click();
		dr.findElement(By.xpath("//input[@value='baby']")).click();
		dr.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		dr.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		dr.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		dr.findElement(By.linkText("Click to know about us")).click();
		dr.navigate().back();
		
		WebElement DD =dr.findElement(By.xpath("//select[@id='Relegion']"));
		Select select = new Select(DD);
		select.selectByValue("1");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByVisibleText("Religion 4");
		dr.findElement(By.xpath("//input[@value='Sign up']")).click();
		dr.close();
		
	}
	
	
	

}
