package com.test.basic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Geetha\\Software\\latest_software_qa\\D:\\Geetha\\Software\\latest_software_qa\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	       
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The title of the page is"+driver.getTitle());
		driver.close();
		driver.quit();
		
		}

}	
