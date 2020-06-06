package com.test.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthendication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strchromedriver="D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		//https://the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
