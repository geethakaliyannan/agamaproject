package com.test.basic;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strchromedriver="D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a/div/b")).click();
		driver.findElement(By.partialLinkText("32 bit Windows IE")).click();
		File file = new File("C:\\Users\\vaidees\\Downloads\\IEDriverServer_Win32_3.150.1 (2).zip");
		boolean check = file.exists();
		System.out.println(check);
		
		//File file = new File()
		
		

	}

}
