package DragDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrotechMinds_Assign22_23_24 {

	public static void main(String[] args)
	{
		
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d1.get("https://grotechminds.com/drag-and-drop/");
		d1.manage().window().maximize();
		Actions action = new Actions(d1);
		WebElement drag1 =d1.findElement(By.xpath("(//div[@id='div1'])[4]"));
		WebElement drop1 =d1.findElement(By.xpath("//div[@id='div2']"));
		action.dragAndDrop(drag1, drop1).perform();
		action.dragAndDrop(drop1, drag1).perform();
		
		WebElement drag2 =d1.findElement(By.xpath("(//div[@id='div1'])[2]"));
		action.dragAndDrop(drag2, drop1).perform();
		action.dragAndDrop(drop1, drag2).perform();
		
		action.dragAndDrop(drag1, drop1).perform();
		action.dragAndDrop(drag2, drop1).perform();
		
		
	}

}
