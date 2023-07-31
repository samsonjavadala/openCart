package testcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.KiteLogin;
import pageObjects.Mainpage;
import pageObjects.accountRegistrationPage;
import pageObjects.homePage;
import testBase.baseClass;

public class Tc_02_KiteLogin extends baseClass {

	
	
	
	@Test
	
	public void KiteLogin()
	{   logger.debug("debug kite");
		logger.info("Kite login");
		KiteLogin login= new KiteLogin(driver);
		login.UsernamePassword("yd7304", "P@55word");
		System.out.println("Enter Auth Code");
		login.submit();
		Scanner abc= new Scanner(System.in);
        String Authcode=abc.next();
        login.entercode(Authcode);
        Mainpage mp=new Mainpage(driver);
       mp.Watchlist1();
       mp.Watchlist4();
       mp.DCB();
		
	}
	
}
