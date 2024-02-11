package testNGPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RedBus 
{
	@Test
	void main()
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d1.get("https://www.redbus.in");
		d1.manage().window().maximize();
		d1.findElement(By.id("src")).sendKeys("pune");
		List<WebElement> elements1 =d1.findElements(By.xpath("//div[@role='button']/ul/li"));
		elements1.get(0).click();
		
		
		d1.findElement(By.id("dest")).sendKeys("nashik");
		List<WebElement> elements2 =d1.findElements(By.xpath("//div[@role='button']/ul/li"));
		elements2.get(0).click();
		
		d1.findElement(By.id("onwardCal")).click();
		d1.findElement(By.xpath("(//span[@class='DayTilesWrapper__SpanContainer-sc-19pz9i8-0 hQhlTG'])[2]/div[3]")).click();
		d1.findElement(By.xpath("//*[.='SEARCH BUSES']")).click();
		
	}
	
	

}
