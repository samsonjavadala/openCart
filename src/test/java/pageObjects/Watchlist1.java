package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Watchlist1 extends basePage{

	
	
	public Watchlist1(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='userid']")
	WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@placeholder='••••••']")
	WebElement code;
	
	//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("yd7304");
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("P@55word");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//input[@placeholder='••••••']")).sendKeys(Authcode);
	public void UsernamePassword(String username ,String PasssWord)
	{
		userid.sendKeys(username);
		password.sendKeys(PasssWord);
	}
	
	public void submit() {
		submit.click();
	}
	public void entercode(String Authcode) {
		code.sendKeys(Authcode);
	}
	
}
