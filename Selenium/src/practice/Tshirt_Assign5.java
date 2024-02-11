package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tshirt_Assign5 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirt");
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		dr.findElement(By.linkText("Men's Regular Fit Polo")).click();
		Thread.sleep(5000);
		WebElement dr2 = dr.findElement(By.linkText("Visit the Van Heusen Store"));
		dr2.click();
		dr.quit();
		
		

	}

}
