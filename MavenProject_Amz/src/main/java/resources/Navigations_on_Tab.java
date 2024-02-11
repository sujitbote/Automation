package resources;

import org.openqa.selenium.WebDriver;

public class Navigations_on_Tab {
	WebDriver driver;
	String pagetitle;

	public void navigate_Tab_Forward() {
		driver.navigate().forward();
	}

	public void navigate_Tab_Back() {
		driver.navigate().back();
	}

	public void tab_Refresh() {
		driver.navigate().refresh();
	}

	public Navigations_on_Tab(WebDriver driver) {
		this.driver = driver;
	}

	public void switch_to_Frame() {
		driver.switchTo().frame(0);
	}

	public void get_Page_Title(String pagetitle) {
		pagetitle = driver.getTitle();
		this.pagetitle = pagetitle;
		System.out.println(pagetitle);
	}

	public void navigate_Back_from_CheckoutPage() {
		driver.getTitle();

		while (!(driver.getTitle().equals(pagetitle))) {
			driver.navigate().back();
		}
	}

}
