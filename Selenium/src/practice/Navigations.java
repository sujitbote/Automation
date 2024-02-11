package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver a1 = new ChromeDriver(); //empty browser
		
		a1.manage().window().maximize();
		a1.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		a1.navigate().refresh();
		a1.navigate().back();
		Thread.sleep(2000);
		a1.navigate().forward();

	}

}
