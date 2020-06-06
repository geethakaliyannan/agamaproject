package com.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strchromedriver="D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//1.Id
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		// 2.Relative X-path
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		//3. Linktext
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//4.partial link
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//5.absolute X path
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		// And condition
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("geetha");
		
		//Or condition
		driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_v' ]")).sendKeys("Kaliyannan");
		
		// Contains
		driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]" )).sendKeys("1234567");
		
		// Start with
		driver.findElement(By.xpath("//*[starts-with(@name,'reg_p')]")).sendKeys("ffhghgyyu");
		
	   




		

		

	}

}
