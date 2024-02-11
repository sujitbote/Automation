package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver dr = new EdgeDriver();
		
	//	dr.get("https://www.amazon.in/Sparx-SM-675-Turkey-G-Yellow-SX0675GTBGD0009/dp/B08WJ1WRL7/ref=sr_1_7?crid=1DJTTIM2ORQUS&keywords=shoes&qid=1702211227&sprefix=shoes%2Caps%2C209&sr=8-7&th=1&psc=1");
		
		
		dr.get("https://www.amazon.in");
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dr2 = dr.findElement(By.id("twotabsearchtextbox"));
		dr2.sendKeys("shoes");
		dr2.sendKeys(Keys.ENTER);
		
		WebElement dr3 = dr.findElement(By.linkText("Mens Sx0675gRunning Shoe"));
		dr3.click();
		
		Thread.sleep(5000);
		//dr.findElement(By.id("add-to-cart-button")).click();
		
		
		WebElement dr4 = dr.findElement(By.xpath("//span[@id='submit.buy-now-announce']"));
		dr4.click();
		
	}

}
