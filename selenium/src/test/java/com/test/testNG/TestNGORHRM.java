package com.test.testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.commonservices.CommonMethods;

public class TestNGORHRM {

	CommonMethods cm = new CommonMethods();

	@BeforeTest
	public void launchBrowser() {
		cm.chrome_browser("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 1)
	public void loginpage() {
		cm.byid_sendkey("txtUsername", "Admin");
		cm.byid_sendkey("txtPassword", "admin123");
		cm.byxpath_click("//*[@id=\'btnLogin\']");

	}

	@Test(priority = 2)
	public void adminpage() {
		cm.byid_click("menu_admin_viewAdminModule");
		cm.byid_sendkey("searchSystemUser_userName", "suja");
		cm.selectdropdown("searchSystemUser_userType", "ESS");
		cm.byxpath_sendkey("//*[@type='text' and @name=\'searchSystemUser[employeeName][empName]\']", "ponda");
		cm.selectdropdown("searchSystemUser_status", "Enabled");
		cm.byxpath_click("//input[@id=\'searchBtn\' or @name='_search' ]");

	}

	@AfterTest
	public void terminateBrowser() {
		cm.closeapp();
	}
}
