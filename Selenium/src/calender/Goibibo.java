package calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		List<WebElement> fromvalue = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		fromvalue.get(0).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nashik");
		List<WebElement> tovalue = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		tovalue.get(0).click();
		
		String RequiredMonth = "May 2024";
		String RequiredDate = "3";
		
		while(true)
		{
			WebElement SelectedMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[1]"));
			//System.out.println(SelectedMonth.getText());
			String ActualMonth = SelectedMonth.getText();
			
			if(ActualMonth.equals(RequiredMonth))
			{
				break;
			}
			else
			{
				WebElement NextMonth = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
				NextMonth.click();
			}
			
		}
		
		List <WebElement> SelectedDate = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div"));
		
		for(WebElement ActualDate : SelectedDate)
		{
			if(ActualDate.getText().equals(RequiredDate))
			{
				ActualDate.click();
				driver.findElement(By.xpath("//*[.='Done']")).click();
				break;
			}
		}
		
		for(int i=0; i<1;i++)
		{
			driver.findElement(By.xpath("(//*[@class='sc-12foipm-64 dGRyPm'])[2]")).click();
		}
		
		for(int i=0; i<2;i++)
		{
			driver.findElement(By.xpath("(//*[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
		}
		
		for(int i=0; i<1;i++)
		{
			driver.findElement(By.xpath("(//*[@class='sc-12foipm-64 dGRyPm'])[6]")).click();
		}
		
		driver.findElement(By.xpath("//*[.='Done']")).click();
		driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']")).click();
		
		driver.close();
		
	}
}
