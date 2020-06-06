package com.test.basic;

import java.io.IOException;

import com.test.commonservices.CommonMethods;

public class Callrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CommonMethods wm = new CommonMethods();
		wm.chrome_browser("https://www.amazon.com/");
		wm.byid_sendkey("email", "joshij@gmail.com");
		wm.byid_sendkey("pass", "xxxxxx");
		wm.byxpath_click("u_0_2");
		wm.takesnap("D:\\\\Geetha\\file1.png");
		wm.closeapp();
	}

}
