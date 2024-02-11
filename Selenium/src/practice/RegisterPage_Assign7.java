package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage_Assign7
{

	public static void main(String[] args)
	{
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://grotechminds.com/registration/");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.id("fname")).sendKeys("Sujit");
		dr.findElement(By.id("lname")).sendKeys("Bote");
		dr.findElement(By.id("Username")).sendKeys("Sbote42");
		dr.findElement(By.id("password")).sendKeys("Sujitbote@42");
		dr.findElement(By.id("Male")).click();
		WebElement skillDD = dr.findElement(By.id("Skills"));
		WebElement countryDD = dr.findElement(By.id("Country"));
		WebElement regionDD = dr.findElement(By.id("Relegion"));
		Select sc[] = {new Select(skillDD), new Select(countryDD),new Select(regionDD)};
		//sc.selectByValue("select1");
		//Select sc1 = new Select(countryDD);
		sc[0].selectByValue("select1");
		sc[1].selectByValue("India");
		dr.findElement(By.id("w3review")).sendKeys("ravet, india");
		dr.findElement(By.id("Address")).sendKeys("ambad, nashik");
		dr.findElement(By.id("Pincode")).sendKeys("412101");
		//Select sc2 = new Select(regionDD);
		//sc2.selectByValue("Hindu");
		sc[2].selectByValue("Hindu");
		dr.findElement(By.id("Agree")).click();
		dr.findElement(By.id("Resume")).sendKeys("C:\\Users\\Shree\\Documents\\New folder");
		//dr.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		

	
	}

}
