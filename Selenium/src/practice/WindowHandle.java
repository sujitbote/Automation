package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{

		ChromeDriver a1 = new ChromeDriver();
		
		a1.manage().window().maximize();
		
		a1.get("https://www.facebook.com");
		System.out.println(a1.getWindowHandle());
	}

}
