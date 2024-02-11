package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDD_Assign20 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver a1 = new ChromeDriver();
		a1.manage().window().maximize();
		a1.navigate().to("https://www.amazon.in");
		WebElement a2 =a1.findElement(By.xpath("(//div[@class='nav-left'])[2]"));
		//a1.findElement(By.className("nav-search-scope nav-sprite")).sendKeys(Keys.ENTER);
		//Select sc = new Select(a2);
	//	Thread.sleep(2000);
		a2.click();
		WebElement a3 =a1.findElement(By.id("searchDropdownBox"));
		for(int i=0; i<11; i++)
		{
			a3.sendKeys(Keys.ARROW_DOWN);
		}
		
		a3.sendKeys(Keys.ENTER);
		WebElement a4 =a1.findElement(By.id("twotabsearchtextbox"));
		a4.sendKeys("computer");
		a4.sendKeys(Keys.ENTER);
	}

}
