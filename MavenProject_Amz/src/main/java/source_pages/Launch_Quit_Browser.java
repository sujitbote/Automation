package source_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit_Browser
{
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String nameofbrowser)
	{
	
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
}
