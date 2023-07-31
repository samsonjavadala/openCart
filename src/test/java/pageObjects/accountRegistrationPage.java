package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegistrationPage extends basePage{

	
	
	public accountRegistrationPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(name="firstname")
	WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlastname1;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="telephone")
	WebElement txttelephone;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="confirm")
	WebElement txtconfirm;
	
	@FindBy(name="agree")
	WebElement chdpolicy;
	
	@FindBy(xpath="//input[@id='input-newsletter-yes']")
	WebElement subscribe;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement contuine;
	
	//button[@type='submit']
	//input[@id='input-newsletter-yes']
	//a[normalize-space()='Register']
	//span[normalize-space()='My Account']
	
	//actions method
	
	public void clickMyaccount()
	{
		
	}
	
	public void clickRegister() {
		
	}
	
}
