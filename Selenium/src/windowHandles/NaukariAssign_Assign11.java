package windowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariAssign_Assign11 {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		dr.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAhc-sBhCEARIsAOVwHuSXJ6MXNhwu9FFsvMDYPJ0WQc6j6EJDmrNta8D3uBps8EDdtXHbNpwaAmJ1EALw_wcB&gclsrc=aw.ds");
		dr.manage().window().maximize();
		
		dr.findElement(By.name("google-register")).click();
		
		Set<String> handles =dr.getWindowHandles();
		System.out.println(handles);
		Iterator<String> iterate =handles.iterator();
		iterate.next();
		String childtab =iterate.next();
		dr.switchTo().window(childtab);
		dr.findElement(By.id("identifierId")).sendKeys("test123@gmail.com");
		dr.findElement(By.xpath("//span[.='Next']")).click();
		dr.quit();
		
	}

}
