package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		
		ChromeDriver a1 = new ChromeDriver();
		
		a1.manage().window().maximize();
		
		a1.get("https://www.google.in");
		
		//a1.findElement(By.id("APjFqb")).sendKeys("india");
		//a1.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("india");
	
		//a1.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		WebElement tab = a1.findElement(By.tagName("body"));
		tab.sendKeys(Keys.CONTROL+ "t");		

	}

}
