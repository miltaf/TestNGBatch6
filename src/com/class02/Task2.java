package com.class02;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class Task2 extends CommonMethods{
	@Test
	public void openApp() throws InterruptedException {
		setUp();
		Thread.sleep(2000);
		}
		
	@Test
	public void logoDisplayed() {
		String expectedTitle="Syntax HRM";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle, "Logo is not matching");
	}
	}
