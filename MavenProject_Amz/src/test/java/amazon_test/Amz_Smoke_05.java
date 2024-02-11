package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import resources.Navigations_on_Tab;
import source_pages.Amz_Account_Page;
import source_pages.Amz_Checkout_Page;
import source_pages.Amz_Login_Page;
import source_pages.Amz_Logout_Page;
import source_pages.Amz_Product_Page;
import source_pages.Amz_Wishlist_Page;
import source_pages.Launch_Quit_Browser;

//Login->seraching->adding the product to wishlist->adding the product to cart->reaching till payment option CC->logout
@Listeners (resources.TestListeners.class)

public class Amz_Smoke_05 extends Launch_Quit_Browser
{
	@Test(dataProvider="data1", dataProviderClass=resources.Fetch_Excel_Data.class)

	public void login_addProd_CC_DC_PaymentOption_logout(String un, String pwd) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Fetch_Excel_Data.fetchValue();

		Amz_Login_Page login = new Amz_Login_Page(driver);
		Amz_Account_Page account = new Amz_Account_Page(driver);
		Amz_Product_Page search = new Amz_Product_Page(driver);
		Amz_Wishlist_Page wishlist = new Amz_Wishlist_Page(driver);
		Amz_Logout_Page logout = new Amz_Logout_Page(driver);
		Amz_Checkout_Page checkout = new Amz_Checkout_Page(driver);
		Navigations_on_Tab navigate = new Navigations_on_Tab(driver);
		
		login.navigatetoSigninPage();
		login.enterUsername(un);
		login.click_Continue_pb();
		
		login.enterPassword(pwd);
		login.click_sign_in_pb();
		
		//Thread.sleep(10000);
		
		search.searchProduct();
		search.enter_after_searchProduct();
		search.click_on_searchedProduct();

		search.moveControl_to_childTab();
		
		wishlist.click_Wishlish_pb();
		wishlist.view_wishlist();
		
		navigate.get_Page_Title("title");
		
		wishlist.click_on_Add_to_Cart_fromWishListPage();
		wishlist.click_on_Proceed_to_Checkout_fromWishListPage();
	
		checkout.use_Selected_Address();
		checkout.select_credit_debit_card_rb();
		
		navigate.navigate_Back_from_CheckoutPage();
		
		account.hoverOver_AccountOptions();
		logout.click_sign_out_pb();
		
	}
	
}
