package source_pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Amz_Product_Page
{
	SoftAssert softassert = new SoftAssert();
	
	
	WebDriver driver;
	//locate all required elements by using @FindBy annotation
	
	@FindBy (id = "twotabsearchtextbox")
	WebElement search_product;
	
	@FindBy (xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
	WebElement click_SearchedProduct;
	
	@FindBy (id = "corePriceDisplay_desktop_feature_div")
	WebElement product_price_tag;
	
	@FindBy (id = "detailBulletsReverseInterleaveContainer_feature_v2")
	WebElement product_details_section;
	
	@FindBy (id = "aplus_feature_div")
	WebElement product_description_section;
	
	//create separate method for each component to perform an action
	
	public void searchProduct()
	{
		search_product.sendKeys("shoe");
	}
	
	public void enter_after_searchProduct()
	{		
		search_product.sendKeys(Keys.ENTER);
	}
	
	public void click_on_searchedProduct()
	{
		click_SearchedProduct.click();
	}
	
	public void moveControl_to_childTab()
	{
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> iterate =handle.iterator();
		iterate.next();
		String childTab = iterate.next();
		driver.switchTo().window(childTab);
	}
	
	public void check_ProductDetailsSection_isPresent()
	{
		softassert.assertTrue(product_details_section.isDisplayed(), "Product details section is not displayed");
		System.out.println("Product details section is displayed successfully");
	}
	
	public void check_ProductDescriptionSection_isPresent()
	{
		softassert.assertTrue(product_description_section.isDisplayed(), "Product description section is not displayed");
		System.out.println("Product description section is displayed successfully");
	}
	
	public void check_ProductPrice_isPresent()
	{
		softassert.assertFalse(product_price_tag.isDisplayed(), "Product price tag is not displayed");
		//System.out.println("Product price tag is displayed successfully");
	}
	
	public void assertAll()
	{
		softassert.assertAll();
	}
	
	
	//initializing component with PageFactory class by creating constructor
	
	public Amz_Product_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
