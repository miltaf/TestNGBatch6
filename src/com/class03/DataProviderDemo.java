package com.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class DataProviderDemo extends CommonMethods {

	@Test(dataProvider = "getData")
	public void login(String username, String password, int age) {
		System.out.println(age);
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);

		boolean isDisplayed = dashboard.welcome.isDisplayed();
		Assert.assertTrue(isDisplayed, "Welcome msg is not displayed");
	}

	// This method that has a @DataProvider annotation
	// should return a 2D-Array
	@DataProvider
	public Object[][] getData() {

		// This is like doing the following three steps
		// login("Admin", "Hum@nhrm123", 23);
		// login("Syntax", "Syntax123!", 25);
		// login("SyntaxUser", "Syntax123!", 20);

		// The number of rows will decide how many times the test will run
		// The columns of each row are bound/pass as parameter to Test Case
		Object[][] data = { 
				{ "Admin", "Hum@nhrm123", 23 }, 
				{ "Syntax", "Syntax123!", 25 },
				{ "SyntaxUser", "Syntax123!", 20 } 
		};

		// 2nd way of initializing a 2D-Array
//		Object[][] data2 = new Object[3][3];
//		data2 [0][0] = "Admin";
//		data2 [0][1] = "Hum@nhrm123";
//		data2 [0][2] = 23;
//
//		data2 [1][0] = "Syntax";
//		data2 [1][1] = "Syntax123!";
//		data2 [1][2] = 25;
//		
//		data2 [2][0] = "SyntaxUser";
//		data2 [2][1] = "Syntax123!";
//		data2 [2][2] = 20;

		return data;
	}

}
