package hoverOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverAutomateMe_Assign14 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://grotechminds.com/automate-me/");
		dr.manage().window().maximize();
		Actions action = new Actions(dr);
		
		WebElement hover1 =dr.findElement(By.xpath("((//div[@class='elementor elementor-228044']/div)[3]/div/div)[1]"));
		action.moveToElement(hover1).perform();
		//Thread.sleep(2000);
		dr.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__overlay']/div/a)[7]")).click();
		
		WebElement hover2 = dr.findElement(By.xpath("//div[@class='toolrip5']"));
		WebElement hover3 = dr.findElement(By.xpath("//div[@class='toolrip8']"));

		//WebElement hover4 = dr.findElement(By.xpath("(//div[@class='toolrip4'])[2]"));

		action.moveToElement(hover2).perform();
		//Thread.sleep(2000);
		
		WebDriverWait wdw = new WebDriverWait(dr,Duration.ofSeconds(8));
		wdw.until(ExpectedConditions.elementToBeClickable(hover3));	
		
		action.moveToElement(hover3).perform();
//		Thread.sleep(2000);
//
//		action.moveToElement(hover4).perform();

		//dr.findElement(By.xpath("((//span[@class='toolriptext4'])[1]/div)[3]")).click();
		//dr.navigate().back();
		
		//action.moveToElement(hover3).perform();
//		dr.findElement(By.xpath("((//span[@class='toolriptext4'])[1]/div)[10]")).click();
		
//		WebDriverWait wdw = new WebDriverWait(dr, Duration.ofSeconds(5));
//		wdw.until();
		

	}

}
