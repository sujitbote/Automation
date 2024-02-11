package testNGPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CalenderPract 
{
	ChromeDriver dr;
	
	@Test
	public void redBus()
	{
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.redbus.in/");
		dr.manage().window().maximize();
		
		WebElement source = dr.findElement(By.id("src"));
		source.sendKeys("Pune");
		
		List<WebElement> srclist = dr.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		srclist.get(0).click();
		
		dr.findElement(By.id("dest")).sendKeys("Nashik");
		List<WebElement> destlist = dr.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		destlist.get(0).click();
		
		String expectedmonth = "May 2024";
		String expecteddate = "25";
		
		while(true)
		{
			WebElement month = dr.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div)[2]"));
			String selectedmonth = month.getText();
			String actualmonth = selectedmonth.substring(0, 8);
			
			if(actualmonth.equals(expectedmonth))
			{
				break;
			}
			
			else
			{
				WebElement nxtmonth = dr.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div)[3]"));
				nxtmonth.click();

			}
		}
		
		List<WebElement> day = dr.findElements(By.xpath("//span[@class='DayTilesWrapper__SpanContainer-sc-19pz9i8-0 hQhlTG']/div"));
		
		for(WebElement selectedday : day)
		{
			if(selectedday.getText().equals(expecteddate))
			{
				selectedday.click();
				break;
			}
			
		}
		
		
		//dr.switchTo().alert().dismiss();
//		WebElement button = dr.findElement(By.xpath("//div[@class='sc-ckVGcZ ikHMPa']/button"));

		
//		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
//		
//		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_buttn")));
//		
//		button.click();
		
		Actions a1 = new Actions(dr);
		a1.contextClick(source);
//		
		
		
	}

}
