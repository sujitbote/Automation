package testNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonBuyClickAssign11
{
	ChromeDriver dr;
	

	@Test
	public void launch() throws IOException
	{
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.navigate().to("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		TakesScreenshot ss = dr;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS1_launch_" + Math.random() + ".jpeg");
		FileUtils.copyFile(src, dest);
	}
	
	@Test (priority=1)
	public void searchProduct() throws IOException
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement search =dr.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		TakesScreenshot ss = dr;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS2_searchProduct_"+Math.random()+".png");
		FileUtils.copyFile(src, dest);
	}
	
	@Test (priority=2)
	public void selectProduct() throws IOException
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement search =dr.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		search.click();
		
		TakesScreenshot ss = dr;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS3_selectProduct_"+Math.random()+".jpg");
		FileUtils.copyFile(src, dest);

	}
	
	@Test (priority=3)
	public void switchtoProductWindow() throws IOException
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Set<String> handles =dr.getWindowHandles();
		Iterator<String> iterate =handles.iterator();
		iterate.next();
		String parentwindow =iterate.next();
		dr.switchTo().window(parentwindow);
		
		TakesScreenshot ss = dr;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS4_switchtoProductWindow_"+Math.random()+".jpeg");
		FileUtils.copyFile(src, dest);

	}
	
	@Test (priority=4)
	public void accountLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream filepath = new FileInputStream("C:\\Users\\Shree\\eclipse new version workplace\\Testng\\LoginData\\TestData.xlsx");
		Workbook file = WorkbookFactory.create(filepath);
		String username =file.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String password =file.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dr.findElement(By.id("buy-now-button")).click();
		dr.findElement(By.id("ap_email")).sendKeys(username);
		dr.findElement(By.id("continue")).click();
		dr.findElement(By.id("ap_password")).sendKeys(password);
		dr.findElement(By.id("signInSubmit")).click();
		
		
		
//			WebDriverWait wdw = new WebDriverWait(dr, Duration.ofSeconds(10));
//			WebElement captcha =dr.findElement(By.name("cvf_captcha_input"));
			Thread.sleep(8000);
//			String captchavalue =captcha.getText();
//			wdw.until(ExpectedConditions.textToBePresentInElementValue(captcha, captchavalue));
//			dr.findElement(By.linkText("Continue")).click();
		
		
		
	
		
		File src =dr.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ss = dr;
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS5_"+dr.getTitle()+Math.random()+".png");
		FileUtils.copyFile(src, dest);
	}
	
	@Test (priority=5)
	public void selectPaymentMethod() throws IOException
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement payDD = dr.findElement(By.xpath("//select[@name='ppw-bankSelection_dropdown']"));
		Select select = new Select(payDD);
		select.selectByVisibleText("Axis Bank");
		
		dr.findElement(By.xpath("//div[@class='a-box a-box-title']/div/span")).click();
		

		dr.findElement(By.xpath("//*[.='Enter card details']")).click();
		
		TakesScreenshot ss = dr;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shree\\Documents\\SS from selenium\\SS6_accountLogin_"+Math.random()+".jpg");
		FileUtils.copyFile(src, dest);
		System.out.println(dr.getWindowHandles());

		
		//dr.findElement(By.id("pp-zXbFUF-16")).sendKeys("123456789");
		
		//Actions a1 = new Actions(dr);
//		dr.switchTo().alert().dismiss();
//		dr.switchTo();
		
	}
	

}
