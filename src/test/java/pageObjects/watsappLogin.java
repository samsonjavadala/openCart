package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class watsappLogin extends basePage {

	public watsappLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")
	WebElement search;
	//

	@FindBy(xpath="//span[@title='Own Number']")
	WebElement own;
	
	
	@FindBy(xpath="//span[@title='Home']")
	WebElement home;
	
	//div[@title='Type a message']//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']
	//span[@data-testid='send']
	//span[@data-testid='send']
	@FindBy(xpath="//div[@title='Type a message']//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")
	WebElement message;
	@FindBy(xpath="//span[@data-testid='send']")
	WebElement send;

	
	
	
	
	public void clickProducts() throws InterruptedException {
		
		Actions a= new Actions(driver);
		a.moveToElement(products).build().perform();
		Thread.sleep(3000);
		
		
	}
	public void Search() {
		search.click();
		
	}
	
	public void mobilenumber(String s) {
		search.sendKeys(s);
	}
	public void OWN( ) {
		own.click();
	}
	public void Message(String Massage ) {
		message.sendKeys(Massage);	
	}
	
	public void Send( ) {
		send.click();	
	}
	public void Home( ) {
		home.click();
	}
	
	
	
}
