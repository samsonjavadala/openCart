package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class tradingViewMain extends basePage {

	public tradingViewMain(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[normalize-space()='Products']")
	WebElement products;
	
	@FindBy(xpath="//span[normalize-space()='Screeners']")
	WebElement screeners;
	
	@FindBy(xpath="//div[@class='tv-data-table-sticky-wrapper tv-screener-sticky-header-wrapper']//div[@class='js-head-title tv-screener-table__head-left--title-three-lines'][normalize-space()='Mkt Cap']")
	WebElement Marketcap;
	@FindBy(xpath="//div[@class='tv-data-table-sticky-wrapper tv-screener-sticky-header-wrapper']//th[@class='tv-data-table__th tv-data-table__cell js-tv-data-table-th js-tv-data-table-th-Recommend_All tv-data-table__sortable tv-screener-table__sortable tv-screener-table__th js-draggable']//i[@class='js-filter-button tv-screener-table__filter-button']")
	WebElement Techfilter;
	@FindBy(xpath="//i[@class='tv-screener-inplace-editor__selectbox-dropdown-toggle']")
	WebElement techselect;
	@FindBy(xpath="//input[@name='Strong Sell']")
	WebElement strongsell;
	@FindBy(xpath="//input[@name='Sell']")
	WebElement sell;
	@FindBy(xpath="//input[@name='Neutral']")
	WebElement Neutral;
	@FindBy(xpath="//input[@name='Buy1']")
	WebElement Buy;
	@FindBy(xpath="//input[@name='Strong Buy']")
	WebElement strongbuy;
	
	
	public void clickProducts() throws InterruptedException {
		
		Actions a= new Actions(driver);
		a.moveToElement(products).build().perform();
		Thread.sleep(3000);
		
		
	}
	public void clickScreeners() {
		screeners.click();
	}
	public void marketCap() throws InterruptedException {
		Marketcap.click();
		Thread.sleep(3000);
		Marketcap.click();
	}
	public void techFilter() {
		Techfilter.click();
		techselect.click();
		strongsell.click();
		
	}
	public void sell() {
		sell.click();
	}
	public void Neutral() {
		Neutral.click();
	}
	public void Buy() {
		Buy.click();
	}
	
	//strongbuy
	public void strongbuy() {
		strongbuy.click();
	}
	
}
