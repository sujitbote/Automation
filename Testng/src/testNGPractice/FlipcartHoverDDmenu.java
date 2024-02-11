package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipcartHoverDDmenu 
{
	
	@Test
	void main() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		
		WebElement dd1 =driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		WebElement dd2 =driver.findElement(By.xpath("(//span[.='Electronics'])[2]"));

		action.moveToElement(dd1).build().perform();
		action.moveToElement(dd2).build().perform();
	
	}

}