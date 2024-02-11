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
import source_pages.Launch_Quit_Browser;


//scenario = Login->logout

@Listeners (resources.TestListeners.class)
public class Amz_Smoke_10 extends Launch_Quit_Browser
{
	
	@Test (dataProvider="data1", dataProviderClass=Fetch_Excel_Data.class)
	public void login_addtoCart_Logout(String un, String pwd) throws EncryptedDocumentException, IOException, InterruptedException
	{

		Amz_Login_Page login = new Amz_Login_Page(driver);
		Amz_Account_Page account = new Amz_Account_Page(driver);
		Amz_Logout_Page logout = new Amz_Logout_Page(driver);
		Amz_Product_Page product = new Amz_Product_Page(driver);

		login.navigatetoSigninPage();
		login.enterUsername(un);
		login.click_Continue_pb();
		login.enterPassword(pwd);
		login.click_sign_in_pb();

		product.searchProduct();
		product.enter_after_searchProduct();
		product.click_on_searchedProduct();

		product.moveControl_to_childTab();
		
		product.check_ProductPrice_isPresent();
		product.check_ProductDetailsSection_isPresent();
		product.check_ProductDescriptionSection_isPresent();
		
		product.assertAll();
		
		account.hoverOver_AccountOptions();
		
		logout.click_sign_out_pb();
		
	}

}
