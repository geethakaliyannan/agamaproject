package com.test.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuit");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");

	}

	@Test
	public void Testcase2() {
		System.out.println("Testcase2");
	}

	/*@Test
	
	 * public void Testcase3() { System.out.println("Testcase3");
	 * 
	 * }
	 * 
	 * @Test public void Testcase4() { System.out.println("Testcase4");
	 * 
	 * }
	 */

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuit");
		System.out.println("aftersuit333");

	}

}
