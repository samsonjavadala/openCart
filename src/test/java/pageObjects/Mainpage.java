package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage extends basePage{

	
	
	public Mainpage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(css=".item[data-balloon='Watchlist 1']")
	WebElement Watchlist1;
	
	@FindBy(css=".item[data-balloon='Watchlist 2']")
	WebElement Watchlist2 ;
	@FindBy(css=".item[data-balloon='Watchlist 3']")
	WebElement Watchlist3;
	@FindBy(css=".item[data-balloon='Watchlist 4']")
	WebElement Watchlist4;
	
	@FindBy(xpath="//div[@class='vddl-draggable instrument up index5']//div//div[@class='symbol-wrapper']")
	WebElement DCB;
	
	
	public void Watchlist1()
	{
		Watchlist1.click();
	}
	
	public void Watchlist2()
	{
		Watchlist2.click();
	}
	public void Watchlist3()
	{
		Watchlist3.click();
	}
	public void Watchlist4()
	{
		Watchlist4.click();
		
	}
	public void DCB()
	{
		DCB.click();
		
	}
	
}
