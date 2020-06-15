package com.class02;

import org.testng.annotations.Test;

public class Task {

	@Test(priority =3)
	public void firstMethod() {
		System.out.println("first method");
	}
	
	@Test (enabled = true)
	public void firstMethod1() {
		System.out.println("first Method1");
	}	
	@Test(priority =2)
	public void secondMethod() {
		System.out.println("Second Method");
	}
	
	@Test(priority =1)
	public void thirdMethod() {
		System.out.println("Third Method");
	}
	
	@Test
	public void fourthMethod() {
		System.out.println("Fourth Method");
	}
}
