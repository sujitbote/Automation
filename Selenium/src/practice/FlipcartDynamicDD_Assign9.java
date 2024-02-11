package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipcartDynamicDD_Assign9 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.flipkart.com/");
		
		dr.manage().window().maximize();
		
		//dr.findElement(By.xpath("//span[@role='button']")).click();
		dr.findElement(By.xpath("//span[.='✕']")).click();
		dr.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("shoes");
		List<WebElement> SearchResult = dr.findElements(By.xpath("//form[@method='GET']/ul/li"));
		System.out.println("no of elements found: "+SearchResult.size());
		SearchResult.get(3).click();

	}

}
