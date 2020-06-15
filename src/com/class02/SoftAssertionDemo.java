package com.class02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class SoftAssertionDemo extends CommonMethods {
//	Open Application
//	Verify logo is displayed
//	Enter valid credentials
//	Verify user successfully logged in
//	by verifying welcome message

	@Test
	public void logoAndWelcomeValidation() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		// Logo assertion
		boolean logoDisplayed = login.logo.isDisplayed();

		// I am failing on purpose
		logoDisplayed = false;

		// If I do a (hard) Assert, the code will not continue executing
		// Assert.assertTrue(logoDisplayed, "Logo is not displayed");

		// If I do a (soft) Assert, the code will continue executing
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(logoDisplayed, "Logo is not displayed");

		System.out.println("After first assertion");

		// Logging in
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		// Welcome msg assertion
		boolean msgDisplayed = dashboard.welcome.isDisplayed();
//		Assert.assertTrue(msgDisplayed, "Welcome msg not displayed");
		soft.assertTrue(msgDisplayed, "Welcome msg not displayed");

		// This will collect all soft assertions and then decide if TC passed or failed
		soft.assertAll();

		// Execution stops after assertAll
		// This statement will not be executed
		System.out.println("After assertAll");
	}
}
