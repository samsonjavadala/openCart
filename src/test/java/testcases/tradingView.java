package testcases;

import org.testng.annotations.Test;

import pageObjects.tradingViewMain;
import testBase.baseClass;

public class tradingView extends baseClass{
	
	
	@Test
	
	public void screens() throws InterruptedException {
		
		tradingViewMain tv= new tradingViewMain(driver);
		tv.clickProducts();
		tv.clickScreeners();
		tv.marketCap();
		tv.techFilter();
		tv.sell();
		tv.strongbuy();
		tv.Buy();
		tv.Neutral();
	}
		
		
		
		
	}
		
	


