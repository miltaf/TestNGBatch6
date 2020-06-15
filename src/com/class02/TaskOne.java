package com.class02;

import org.testng.annotations.Test;

public class TaskOne {
	// HW: Read the slides

//	Create a class TaskOne that has 5 test methods named:
//	firstMethod
//	firstMethod1
//	secondMethod
//	thirdMethod
//	fourthMethod
//	
//	And each of them printing the method name
//	Run and observe results
//
//	Then, add the needed attributes to print the following result:
//	fourthMethod
//	thirdMethod
//	secondMethod
//	firstMethod

	@Test(priority = 3)
	public void firstMethod() {
		System.out.println("firstMethod");
	}

	@Test(enabled = false)
	public void firstMethod1() {
		System.out.println("firstMethod1");
	}

	@Test(priority = 2)
	public void secondMethod() {
		System.out.println("secondMethod");
	}

	@Test(priority = 1)
	public void thirdMethod() {
		System.out.println("thirdMethod");
	}

	@Test
	public void fourthMethod() {
		System.out.println("fourthMethod");
	}
}
