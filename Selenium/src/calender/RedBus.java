package calender;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		List<WebElement> searchFrom = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		searchFrom.get(0).click();
		
		driver.findElement(By.id("dest")).sendKeys("Nashik");
		List<WebElement> searchTo = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		searchTo.get(0).click();
		
		driver.findElement(By.id("onwardCal")).click();
		
		String ReqMonth = "Jan 2026";
		String ReqDate = "3";
		
		while(true)
		{
			WebElement Locatemonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div)[2]"));

			String SelectedMonth = Locatemonth.getText();
			System.out.println(SelectedMonth);
			
			String Monthname[] = SelectedMonth.split("1",2);
			System.out.println(Arrays.toString(Monthname));
			
			String splittedText = Monthname[0];
			String ActualMonth = splittedText.trim();
			System.out.println("ActualMonth is: "+ActualMonth);
			
			if(ActualMonth.equals(ReqMonth))
			{
				break;
			}
			else
			{
				WebElement NextMonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div)[3]"));
				NextMonth.click();
			}
		}
		
		List<WebElement> LocateDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));

		for(WebElement date : LocateDates)
		{
			if(date.getText().equals(ReqDate))
			{
				date.click();
				break;
			}
		}
	}
}
