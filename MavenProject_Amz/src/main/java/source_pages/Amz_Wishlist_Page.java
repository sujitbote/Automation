package source_pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_Wishlist_Page 
{
	WebDriver driver;

	@FindBy (id = "add-to-wishlist-button-submit")
	WebElement add_to_Wishlist;
	
	@FindBy (xpath = "//span[@class='a-button a-button-span12 a-button-primary']")
	WebElement click_ContinueShopping;
	
	@FindBy (xpath = "(//input[@name='submit.deleteItem'])[1]")
	WebElement click_DeleteProduct_from_Wishlist;
	
	@FindBy (xpath ="//a[.='View Your List']")
	WebElement click_view_wishlist;
	
	@FindBy (xpath="//a[@class='a-button-text a-text-center']")
	WebElement add_to_cart_from_wishlist_page;
	
	@FindBy (xpath="//a[.='Proceed to checkout']")
	WebElement Proceed_to_Checkout_fromWishListPage;
	
	public void click_Wishlish_pb()
	{
		add_to_Wishlist.click();
	}
	
	public void click_ContinueShopping_pb()
	{
		click_ContinueShopping.click();
	}
	
	public void DeleteProduct_from_Wishlist()
	{
		click_DeleteProduct_from_Wishlist.click();
	}
	
	public void view_wishlist()
	{
		click_view_wishlist.click();
	}
	
	public void click_on_Add_to_Cart_fromWishListPage()
	{
		add_to_cart_from_wishlist_page.click();
	}
	
	public void click_on_Proceed_to_Checkout_fromWishListPage()
	{
		Proceed_to_Checkout_fromWishListPage.click();
	}
	
	public void waitUntil_wishlistConfirmation_popupLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']")));
	}
	
	
	public Amz_Wishlist_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
