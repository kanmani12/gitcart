package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreenKartPage {
	public WebDriver driver;
	
	public GreenKartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search=By.xpath("//input[@type='search']");
	By ProductName=By.xpath("//div[@class='products-wrapper']/div/div/h4");
	By productincrement=By.cssSelector(".increment");
	By AddToCart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	system.out.println("Change");
	public void SearchItem(String Name)
	{
		driver.findElement(Search).sendKeys(Name);
	}
	public String getSearchText()
	{
	  return driver.findElement(ProductName).getText();
	   
	}
	public String getTitleofGreenkartpage()
	{
		return driver.getTitle();
	}
	public void increment(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(productincrement).click();
			i--;
		}
	}
	public void addtocartbutton()
	{
		driver.findElement(AddToCart).click();
	}

}
