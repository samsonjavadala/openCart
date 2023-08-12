package testcases;

import org.testng.annotations.Test;

import pageObjects.watsappLogin;
import testBase.baseClass;

public class whatsapp extends baseClass{

 @Test (priority = 1)
 
 public void Whatsapplogin() throws InterruptedException
 {
	 
	 watsappLogin ab= new watsappLogin(driver);
	 driver.get("https://web.whatsapp.com/");
	 Thread.sleep(15000);
	ab.Search();
	ab.mobilenumber("7506190633");
	ab.OWN();
	ab.Message("This is my first automated message");
	ab.Send();
	 
 
 }
 @Test (priority = 0)
 
 void Home() throws InterruptedException {
	 watsappLogin ab= new watsappLogin(driver) ;
	 driver.get("https://web.whatsapp.com/");
	 Thread.sleep(15000);
		ab.Search();
		ab.mobilenumber("7678053060");
		ab.Home();
		ab.Message("check");
		ab.Send();
 }
	
	
	
}
