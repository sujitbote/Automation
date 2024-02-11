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

//scenario = Login->searching->logout

@Listeners(resources.TestListeners.class)

public class Amz_Smoke_01 extends Launch_Quit_Browser
{
	@Test (retryAnalyzer=resources.RetryAnalyzer.class, dataProvider="data1",dataProviderClass = Fetch_Excel_Data.class)
	public void login_Searching_Logout(String un, String pwd) throws EncryptedDocumentException, IOException
	{
		Amz_Login_Page login = new Amz_Login_Page(driver);
		login.navigatetoSigninPage();
		login.enterUsername(un);
		login.click_Continue_pb();
		login.enterPassword(pwd);
		login.click_sign_in_pb();
		
		//Assert.assertEquals(un, pwd);
		//SoftAssert softassert = new SoftAssert();

		Amz_Product_Page search = new Amz_Product_Page(driver);
		search.searchProduct();
		search.enter_after_searchProduct();
		//softassert.assertEquals(false, true);
		
		Amz_Account_Page account = new Amz_Account_Page(driver);
		account.hoverOver_AccountOptions();
		
		Amz_Logout_Page logout = new Amz_Logout_Page(driver);
		logout.click_sign_out_pb();
		
		//softassert.assertAll();
		
	}
	
}
