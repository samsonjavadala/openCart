package testcases;

import org.testng.annotations.Test;

import pageObjects.accountRegistrationPage;
import pageObjects.homePage;
import testBase.baseClass;

public class Tc_01_Registration extends baseClass {

	
	
	
	@Test
	
	public void test_account_registration()
	{   logger.debug("debug log");
		logger.info("Starting Tc_01_Registration ");
		homePage hp=new homePage(driver);
		hp.clickMyaccount();
		logger.info("clicked on myaccount ");
		hp.clickRegister();
		logger.info("clicked on register ");
		accountRegistrationPage ag=new accountRegistrationPage(driver);
		
		
	}
	
	
}
