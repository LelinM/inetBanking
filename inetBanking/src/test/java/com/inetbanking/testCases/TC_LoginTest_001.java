package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
		@Test
		public void loginTest () throws IOException
		{
			logger.info("URL has opened");
			
			LoginPage lp=new LoginPage (driver);
			lp.setUserName(username);
			logger.info("Username entered");
			
			lp.setPassword(password);
			logger.info("Password entered");

			
			lp.clickSubmit();
			
			if(driver.getTitle().equals( "GTPL Bank Manager HomePage" ))
			{
				Assert.assertTrue(true);
				logger.info("Login test passed");
			}
			else
			{
				captureScreen(driver,"loginTest");
				Assert.assertTrue(false);
				logger.info("Login test failed");
			}
		}
}
