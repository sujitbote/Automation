package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechmindsDD_Assign21 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/registration/");
		WebElement dd1 = dr.findElement(By.id("Skills"));
		dd1.sendKeys(Keys.ENTER);
		for(int i=0; i<1; i++)
		{
			dd1.sendKeys(Keys.ARROW_DOWN);
		}
		dd1.sendKeys(Keys.ENTER);

		//Thread.sleep(3000);
		
		WebElement dd0 = dr.findElement(By.id("technicalskills"));
		dd0.sendKeys(Keys.ENTER);
		for(int i=0; i<7; i++)
		{
			dd0.sendKeys(Keys.ARROW_DOWN);
		}
		
		WebElement dd2 =dr.findElement(By.id("Country"));
		dd2.sendKeys(Keys.ENTER);
		for(int i=0; i<8; i++)
		{
			dd2.sendKeys(Keys.ARROW_DOWN);
		}

		Thread.sleep(2000);
		WebElement dd3 =dr.findElement(By.id("Relegion"));
		dd3.sendKeys(Keys.ENTER);
		for(int i=0; i<1; i++)
		{
			dd3.sendKeys(Keys.ARROW_DOWN);
		}
		dd3.sendKeys(Keys.ENTER);
	
	}

}
