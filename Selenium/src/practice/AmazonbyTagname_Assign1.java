package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonbyTagname_Assign1 {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		
		dr.manage().window().maximize();
		
		WebElement search = dr.findElement(By.xpath("(//div/div/input)[6]"));

		//WebElement search = dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		
		
		//Thread.sleep(5000);
		
		

	}

}
