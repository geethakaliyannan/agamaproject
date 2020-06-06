package com.agamatestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//String strchromedriver = "D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", strchromedriver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is"+driver.getTitle());
		System.out.println("Commpeted");
		
	}
	}
