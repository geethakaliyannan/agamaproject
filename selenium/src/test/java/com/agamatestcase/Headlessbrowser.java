
package com.agamatestcase;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is"+driver.getTitle());
		System.out.println("Commpeted");

	}

}
