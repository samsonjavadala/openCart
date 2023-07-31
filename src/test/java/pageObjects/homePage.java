package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{

	
	
	public homePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	//a[normalize-space()='Register']
	//span[normalize-space()='My Account']
	
	//actions method
	
	public void clickMyaccount()
	{
		linkmyaccount.click();
	}
	
	public void clickRegister() {
		register.click();
	}
	
}
