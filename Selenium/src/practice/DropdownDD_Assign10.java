package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDD_Assign10 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		
		Thread.sleep(5000);
		//List<WebElement> s1 = dr.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		List<WebElement> s1 = dr.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		//List<WebElement> s1 = dr.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		//Thread.sleep(5000);
		
		System.out.println(s1.size());
		s1.get(5).click();
		
	}

}
