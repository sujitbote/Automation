package source_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_ShoppingCart_Page
{
	WebDriver driver;
	
	@FindBy (xpath ="//input[@id='add-to-cart-button']")
	WebElement add_to_cart_pb;
	
	@FindBy (id="nav-cart")
	WebElement go_to_shoppingcart_page;
	
	@FindBy (xpath="(//input[@value='Delete'])[1]")
	WebElement remove_product_from_cart;
	
	@FindBy (id="sc-buy-box-ptc-button")
	WebElement proceed_to_buy_pb;
	
	
	public void click_on_Add_to_Cart_fromProductPage()
	{
		add_to_cart_pb.click();
	}
	

	
	public void go_to_shoppingcart()
	{
		go_to_shoppingcart_page.click();
	}
	
	public void remove_Product_from_ShoppingCart()
	{
		go_to_shoppingcart_page.click();
	}
	
	public void proceed_to_buy()
	{
		proceed_to_buy_pb.click();
	}
	
	
	
	public void waitUntil_addToShoppingCartPBEnabled_afterWishlistpopup()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));
	}
	
	
	public Amz_ShoppingCart_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
