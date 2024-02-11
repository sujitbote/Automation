package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleNav_Assign19 {

	public static void main(String[] args) 
	{
		
		
		ChromeDriver a1 = new ChromeDriver();
		a1.manage().window().maximize();
		a1.navigate().to("https://www.google.com");
		//a1.findElement(By.id("APjFqb")).sendKeys("india");
		a1.findElement(By.className("gLFyf")).sendKeys("india");

		for(int i=0; i<7; i++)
		{
			a1.findElement(By.id("APjFqb")).sendKeys(Keys.ARROW_DOWN);
		}
		a1.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);



	}

}
