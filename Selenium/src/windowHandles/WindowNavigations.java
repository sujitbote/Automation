package windowHandles;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigations {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		Thread.sleep(2000);
		cd.navigate().back();
		Thread.sleep(2000);
		cd.navigate().forward();
		Thread.sleep(2000);
		cd.navigate().to("https://www.flipkart.com/");
		
		
		
		

	}

}
