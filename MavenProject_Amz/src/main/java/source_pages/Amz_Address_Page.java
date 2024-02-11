package source_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Address_Page
{
	String enteredcountry = "india";
	
	@FindBy (xpath="(//a[@class='ya-card__whole-card-link'])[4]")
	WebElement click_your_address;
	
	@FindBy (xpath="//div[@class='a-box-inner a-padding-extra-large']")
	WebElement click_add_addres;
	
	@FindBy (xpath="(//div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container']/span)[1]")
	WebElement select_country_dd;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	WebElement enter_country_name;
	
	@FindBy (xpath="//ul[@id='select2-address-ui-widgets-countryCode-dropdown-nativeId-results']/li")
	List<WebElement> select_country_after_search;
	
	@FindBy (xpath="//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input']")
	List<WebElement> enter_all_address_details;

	@FindBy (xpath="(//input[@class='a-button-input'])[3]")
	WebElement click_on_submit_address_pb;
	
	@FindBy (id="ya-myab-set-default-shipping-btn-1")
	WebElement set_as_default_addtess_pb;
	
	public void click_on_Your_Address()
	{
		click_your_address.click();
	}
	
	public void click_on_Add_Addres()
	{
		click_add_addres.click();
	}
	
	public void select_Country_DD()
	{
		select_country_dd.click();
	}
	
	public void enter_Country_Name()
	{
		enter_country_name.sendKeys(enteredcountry);
		//System.out.println("entered country name is: "+ enteredcountry);
	}
	
	public void select_country_after_search()
	{
		for(WebElement selectcountry : select_country_after_search)
		{
			if(selectcountry.getText().equalsIgnoreCase(enteredcountry))
			{
				selectcountry.click();
				break;
			}
			
		}
	}
	
	public void enter_All_Address_Details()
	{
		for(int i=0; i<enter_all_address_details.size()-1;i++)
		{
			if(i==0)
			{
				enter_all_address_details.get(i).sendKeys("Sujit Bote");
			}
			if(i==1)
			{
				enter_all_address_details.get(i).sendKeys("7350495068");
			}
			if(i==2)
			{
				enter_all_address_details.get(i).sendKeys("412101");
			}
			if(i==3)
			{
				enter_all_address_details.get(i).sendKeys("Bhalchandra puram, flat no. 802");
			}
			if(i==4)
			{
				enter_all_address_details.get(i).sendKeys("Shinde wasti chawk, Ravet");
			}
			if(i==5)
			{
				enter_all_address_details.get(i).sendKeys("Near mathav mithas");
			}
		}
	}
	public void click_on_Submit_Address_pb()
	{
		click_on_submit_address_pb.click();;
	}
	public void set_as_Default_Addtess_pb()
	{
		set_as_default_addtess_pb.click();;
	}
	
	
	public Amz_Address_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
