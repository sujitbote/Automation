package coordinates;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrowtechmindsCoordinates_Assign17 {

	public static void main(String[] args) 
	{
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://grotechminds.com/");
		dr.manage().window().maximize();
		//Actions action = new Actions(dr);
		WebElement a1 =dr.findElement(By.linkText("Automation software Testing Course"));
		Point location = a1.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
	}

}
