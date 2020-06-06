package com.test.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strchromedriver="D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		// driver.windows.maximize
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Fie upload
		driver.get("https://filebin.net/");
		driver.findElement(By.id("fileField")).sendKeys("D:\\Geetha\\Software\\upload file.txt");

		
	}

}
