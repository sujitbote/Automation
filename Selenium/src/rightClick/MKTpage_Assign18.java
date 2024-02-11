package rightClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MKTpage_Assign18 {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://grotechminds.com/left-double-click/");
		dr.manage().window().maximize();
		WebElement a1 = dr.findElement(By.xpath("//div[@class='popup1']"));
		Actions action = new Actions(dr);
		action.doubleClick(a1).perform();
		dr.findElement(By.linkText("Link1")).click();

		
	}

}
