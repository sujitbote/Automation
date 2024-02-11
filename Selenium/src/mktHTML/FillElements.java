package mktHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillElements {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		dr.manage().window().maximize();
		dr.findElement(By.name("username")).sendKeys("Sbote");
		dr.findElement(By.name("say hello")).sendKeys("Hint");
		dr.findElement(By.name("password")).sendKeys("Sbote42");
		dr.findElement(By.name("fname")).sendKeys("sujit");
		dr.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
		dr.navigate().back();
		dr.findElement(By.name("name1")).click();
		dr.findElement(By.name("name2")).click();
		dr.findElement(By.name("name3")).click();
		dr.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		dr.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		dr.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		dr.findElement(By.linkText("Click to know about us")).click();
		dr.navigate().back();
		WebElement DD =dr.findElement(By.id("Relegion"));
		Select sc = new Select(DD);
		sc.selectByValue("3");
		sc.selectByVisibleText("Hindu");
		dr.findElement(By.xpath("//input[@value='Sign up']")).click();
	}

}
