package com.class01;

import org.testng.annotations.*;

public class TaskTwo {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method");
	}

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test 2");
	}

	@Test
	public void test3() {
		System.out.println("This is test 3");
	}

}