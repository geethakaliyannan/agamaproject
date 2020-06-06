package com.test.testNG;
import org.testng.annotations.Test;

public class Jenkintest {
	

	

       @Test(groups= {"smoketesting","sanitytesting"}) 
		public void login() {
			
			System.out.println("login");
		}

	@Test(groups= {"smoketesting","Regressiontesting"})  
		public void search() {
			
			System.out.println("search");
			//Assert.assertEquals("xyz", "abc");
		}

	@Test(groups= {"Regressiontesting","Retesting"})  
		public void logout() {
			
			System.out.println("logout");
		}

}
