package com.test.basic;

import com.test.commonservices.CommonMethods;

public class Wrappermethod {


	

	public static void main(String[] args) {

		CommonMethods oyapp = new CommonMethods();

		oyapp.ie_browser("https://www.google.com/");
		oyapp.byxpath_sendkey("//input[@type='text' and @title=\'Search\']", "testing");
		oyapp.byname_click("btnK");
		oyapp.closeapp();

	}

}