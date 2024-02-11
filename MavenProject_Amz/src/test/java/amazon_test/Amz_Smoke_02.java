package amazon_test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import resources.Fetch_Excel_Data;
import source_pages.Amz_Account_Page;
import source_pages.Amz_Login_Page;
import source_pages.Amz_Logout_Page;
import source_pages.Amz_Product_Page;
import source_pages.Amz_Wishlist_Page;
import source_pages.Launch_Quit_Browser;

//scenario = Login->searching->adding the product to wishlist->adding the product to cart->logout
@Listeners(resources.TestListeners.class)
public class Amz_Smoke_02 extends Launch_Quit_Browser
{
	
	@Test (dataProvider="data1", dataProviderClass=Fetch_Excel_Data.class)
	public void login_addtoCart_Logout(String un, String pwd) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Fetch_Excel_Data.fetchValue();

		Amz_Login_Page login = new Amz_Login_Page(driver);
		login.navigatetoSigninPage();
		login.enterUsername(un);
		login.click_Continue_pb();
		login.enterPassword(pwd);
		login.click_sign_in_pb();
		
		Amz_Product_Page search = new Amz_Product_Page(driver);
		search.searchProduct();
		search.enter_after_searchProduct();
		search.click_on_searchedProduct();

		search.moveControl_to_childTab();
		
		Amz_Wishlist_Page wishlist = new Amz_Wishlist_Page(driver);
		wishlist.click_Wishlish_pb();
		wishlist.waitUntil_wishlistConfirmation_popupLoad();
		wishlist.click_ContinueShopping_pb();

		Amz_Account_Page account = new Amz_Account_Page(driver);
		account.hoverOver_AccountOptions();
		
		Amz_Logout_Page logout = new Amz_Logout_Page(driver);
		logout.click_sign_out_pb();
		
	}

}
