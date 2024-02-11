package windowHandles;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextTabControl_Assign12 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		WebElement searchproduct = cd.findElement(By.id("twotabsearchtextbox"));
		searchproduct.sendKeys("smartphones");
		Thread.sleep(2000);
		List<WebElement> autosuggestions = cd.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println("total no of elements found are: "+ autosuggestions.size());
		autosuggestions.get(1).click();
		WebElement searchedproduct = cd.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"));
		searchedproduct.click();
		Set<String> handles =cd.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		iterator.next();
		String childtab = iterator.next();
		System.out.println(cd.getTitle());
		cd.switchTo().window(childtab);
		System.out.println(cd.getTitle());
		//cd.switchTo().window(parenttab);
		//System.out.println(cd.getTitle());
		//cd.findElement(By.id("buy-now-button")).click();
		cd.findElement(By.id("add-to-cart-button")).click();
	}

}
