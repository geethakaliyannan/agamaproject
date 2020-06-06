package com.agamatestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.HasInputDevices;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("buils test 2");


	}

}
