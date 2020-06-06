package com.agamatestcase;

//import com.test.common.CommonMethods;

import java.io.IOException;

import com.test.commonservices.CommonMethods;

public class CallMavenORHRM {

			public static void main(String[] args)throws IOException, Exception {
			CommonMethods mv=new CommonMethods();
			mv.chrome_browser("https://opensource-demo.orangehrmlive.com/");
			mv.byid_sendkey("txtUsername", "Admin");
			mv.byid_sendkey("txtPassword", "admin123");
			mv.byxpath_click("//*[@id=\'btnLogin\']");
			mv.byxpath_click("//*[@id=\'menu_pim_viewPimModule\']/b");
			//Thread.sleep(1000);
			//mv.byid_click("btnAdd");
			Thread.sleep(1000);
			mv.byxpath_click("//*[@id=\'btnAdd\']");
			mv.byid_sendkey("firstName", "adip");
			mv.byid_sendkey("middleName", "vathy");
			mv.byid_sendkey("lastName", "manumi");
			mv.byid_sendkey("employeeId", "344398");
			mv.fileupload("photofile", "D:\\Geetha\\Software\\path\\ttttt.png");
			mv.byid_click("btnSave");
			mv.takesnap("D:\\Geetha\\Software\\path\\ORHRM1.png");
			
					
			

	}

}
