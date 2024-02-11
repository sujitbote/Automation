package calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetreiveErrorMsg {

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
		WebElement fromvalue1 =fromvalue.get(0);
		String fromvalue1txt = fromvalue1.getText();
		fromvalue1.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		List<WebElement> tovalue = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		WebElement tovalue1 =tovalue.get(0);
		String tovalue1txt = tovalue1.getText();
		tovalue1.click();
		
		if(fromvalue1txt.equals(tovalue1txt))
		{
			WebElement ErrorMsg =driver.findElement(By.xpath("//div[@class='sc-12foipm-36 igDewJ']"));
			System.out.println("Error message received is: "+ErrorMsg.getText()+", please select different values");
		}

	}

}
