package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NxtTab_Assign6 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.flipkart.com/");
		cd.findElement(By.xpath("//span[@role='button']")).click();
		cd.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles");
		Thread.sleep(2000);
		List<WebElement> autosuggestion1 = cd.findElements(By.xpath("//li[@class='_3D0G9a']"));
		autosuggestion1.get(2).click();
		cd.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Set<String> handles = cd.getWindowHandles();
		Iterator<String> iteration = handles.iterator();
		String parentwindow = iteration.next();
		String childwindow = iteration.next();
		cd.switchTo().window(childwindow);
		cd.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//div[@class='IiD88i GtCYSF']/input")).sendKeys("7350495068");
		cd.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
