package com.test.testNG;

import org.testng.annotations.Test;

//import junit.framework.Assert;

public class DeeponsuponMethods {
	@Test() 
	public void login() {
		
		System.out.println("login");
	}
	@Test(dependsOnMethods="login") 
	public void search() {
		
		System.out.println("search");
		//Assert.assertEquals("xyz", "abc");
	}
	@Test(dependsOnMethods="search",alwaysRun=true) 
	public void logout() {
		
		System.out.println("logout");
	}
	

}
