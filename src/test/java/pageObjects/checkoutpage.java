package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	public WebDriver driver;
	
	public checkoutpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By cartbutton=By.xpath("//img[@alt='Cart']");
	By proccedtocheckoutbutton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By Applybutton=By.cssSelector(".promoBtn");
	By placeorder=By.xpath("//button[contains(text(),'Place Order')]");
	By cartaddedproduct=By.cssSelector(".product-name");
	
	public void clickcartbutton()
	{
		driver.findElement(cartbutton).click();
		driver.findElement(proccedtocheckoutbutton).click();
	}
	public boolean validateprmocodebutton()
	{
		return driver.findElement(Applybutton).isEnabled();
	}
	public boolean validateplaceoderbutton()
	{
		return driver.findElement(placeorder).isEnabled();
	}
	public String cartproductvalidation()
	{
		return driver.findElement(cartaddedproduct).getText();
	}


}
