package com.test.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	
	
	
	public static void main(String[] args) {
		String strchromedriver="D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The title of the page is"+driver.getTitle());
		driver.close();
		
		

	}
}