package hoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartHoveronFashion_Assign15_16 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.flipkart.com/");
		
		dr.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		dr.findElement(By.xpath("//span[@role='button']")).click();
		
		Actions action = new Actions(dr);
		
		//Thread.sleep(5000);
		
		WebElement hover1= dr.findElement(By.xpath("//div[@aria-label='Fashion']"));
		action.moveToElement(hover1).perform();
		//dr.findElement(By.linkText("Men's Kurtas")).click();
		//dr.navigate().back();
		System.out.println(dr.getTitle());
		
		Thread.sleep(3000);

		WebElement hover2 = dr.switchTo().activeElement().findElement(By.xpath("//div[@aria-label='Electronics']"));
		action.moveToElement(hover2).perform();
		//Thread.sleep(3000);
		
		WebElement hover3 = dr.findElement(By.linkText("Gaming"));
		action.moveToElement(hover3).perform();
		dr.findElement(By.linkText("Games")).click();
		dr.findElement(By.linkText("Men's Kurtas")).click();

	}

}
