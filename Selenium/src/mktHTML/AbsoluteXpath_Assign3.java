package mktHTML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbsoluteXpath_Assign3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		dr.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		dr.findElement(By.xpath("(//body/input)[1]")).sendKeys("sujitbote42");
		dr.findElement(By.xpath("(//body/input)[2]")).sendKeys("my name");
		dr.findElement(By.xpath("(//body/input)[3]")).sendKeys("Sujit@1");
		dr.findElement(By.xpath("(//body/form/input)[1]")).sendKeys("sujit");
		dr.findElement(By.xpath("(//body/form/input)[3]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("(//body/form/input)[4]")).click();
		dr.findElement(By.xpath("(//body/form/input)[5]")).click();
		dr.findElement(By.xpath("(//body/form/input)[6]")).click();
		dr.findElement(By.xpath("(//body/form/input)[7]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("(//body/input)[4]")).click();
		dr.findElement(By.xpath("(//body/input)[5]")).click();
		dr.findElement(By.xpath("(//body/input)[6]")).click();
		dr.findElement(By.xpath("//body/a")).click();
		dr.navigate().back();
		
		WebElement DD =dr.findElement(By.xpath("//body/select"));
		Select select = new Select(DD);
		select.selectByValue("1");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByVisibleText("Religion 4");
		dr.findElement(By.xpath("(//body/input)[7]")).click();
		dr.close();
		
	}
	
	
	

}
