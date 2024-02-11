package mktHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindExceptionName_Assign13 {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		dr.manage().window().maximize();
		dr.findElement(By.name("username")).sendKeys("Sbote");
		dr.findElement(By.name("say hello")).sendKeys("Hint");
		dr.findElement(By.name("password")).sendKeys("Sbote42");
		dr.findElement(By.name("fname")).sendKeys("sujit");
		dr.findElement(By.name("lname")).sendKeys("sujit");
		

	}

}
