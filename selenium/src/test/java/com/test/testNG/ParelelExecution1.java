package com.test.testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.commonservices.CommonMethods;

public class ParelelExecution1 {

	CommonMethods cm = new CommonMethods();

	@BeforeTest
	public void launchBrowser() {
		cm.chrome_browser("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority=1,description = "Login page")
	public void login() {
		cm.byid_sendkey("txtUsername", "Admin");
		cm.byid_sendkey("txtPassword", "admin123");
		cm.byxpath_click("//*[@id=\'btnLogin\']");
	}

	@Test(priority=2,description = "PIM")
	public void pim() throws Exception {
		cm.byxpath_click("//*[@id=\"menu_pim_viewPimModule\"]/b");
		Thread.sleep(1000);
		cm.byxpath_click("//*[@id=\'btnAdd\']");
		cm.byid_sendkey("firstName", "adip");
		cm.byid_sendkey("middleName", "vathy");
		cm.byid_sendkey("lastName", "manumi");
		cm.byid_sendkey("employeeId", "344398");
		cm.fileupload("photofile", "D:\\Geetha\\Software\\path\\ttttt.png");
		cm.byid_click("btnSave");
		cm.takesnap("D:\\Geetha\\Software\\path\\ORHRM1.png");

	}
	@AfterTest
	public void terminateBrowser() {
		cm.closeapp();
	}
}
