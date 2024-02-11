package hoverOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPract {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		
		WebElement dd1 =driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		WebElement dd2 =driver.findElement(By.xpath("(//span[.='Electronics'])[2]"));
		WebElement dd3 =driver.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		WebElement dd4 =driver.findElement(By.xpath("(//span[.='Beauty, Toys & More'])[2]"));
		WebElement dd5 =driver.findElement(By.xpath("(//span[.='Two Wheelers'])[2]"));
		
		action.moveToElement(dd1).perform();
		action.moveToElement(dd2).perform();
		
		action.moveToElement(dd2).perform();
		action.moveToElement(dd3).perform();

		action.moveToElement(dd3).perform();
		action.moveToElement(dd4).perform();

		action.moveToElement(dd4).perform();
		action.moveToElement(dd5).perform();

		action.moveToElement(dd5).perform();


		
		//action.moveToElement(dd2).perform();

	}

}
