package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	GreenKartPage gp;
	TopDealsPage tdp;
	checkoutpage cp;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public GreenKartPage getGreenKartPage()
	{
	     gp=new GreenKartPage(driver);
		return gp;
		
	}
	public TopDealsPage getTopDealsPage()
	{
		tdp=new TopDealsPage(driver);
		return tdp;
	}
	public checkoutpage getcheckoutpage()
	{
		cp=new checkoutpage(driver);
		return cp;
	}

}
