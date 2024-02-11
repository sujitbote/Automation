package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_pages.Amz_Account_Page;
import source_pages.Amz_Address_Page;
import source_pages.Amz_Login_Page;
import source_pages.Amz_Logout_Page;
import source_pages.Launch_Quit_Browser;

//Login->update your default address->trying to reach till payments page with new address->logout
@Listeners (resources.TestListeners.class)

public class Amz_Smoke_09 extends Launch_Quit_Browser
{
	@Test(dataProvider="data1", dataProviderClass=resources.Fetch_Excel_Data.class)

	public void login_UpdateDefaultAddress_logout(String un, String pwd) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Fetch_Excel_Data.fetchValue();

		Amz_Login_Page login = new Amz_Login_Page(driver);
		Amz_Account_Page account = new Amz_Account_Page(driver);
		Amz_Address_Page address = new Amz_Address_Page(driver);
		Amz_Logout_Page logout = new Amz_Logout_Page(driver);

		login.navigatetoSigninPage();
		login.enterUsername(un);
		login.click_Continue_pb();
		
		login.enterPassword(pwd);
		login.click_sign_in_pb();
		
		account.hoverOver_AccountOptions();
		account.click_on_YourAccount_option();
		
		address.click_on_Your_Address();
		address.click_on_Add_Addres();
		address.select_Country_DD();
		address.enter_Country_Name();
		address.select_country_after_search();
		address.enter_All_Address_Details();
		address.click_on_Submit_Address_pb();
		address.set_as_Default_Addtess_pb();
		
		account.hoverOver_AccountOptions();
		logout.click_sign_out_pb();
	}
	
}
