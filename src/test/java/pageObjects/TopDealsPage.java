package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealsPage {
	public WebDriver driver;
	
	public TopDealsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By TopDealsLink=By.linkText("Top Deals");
	By SearchItem=By.id("search-field");
	By Gettext=By.cssSelector("tr td:nth-child(1)");
	public void clickingtopdealslink()
	{
	   driver.findElement(TopDealsLink).click();
	}
	public void searchitem(String name)
	{
		driver.findElement(SearchItem).sendKeys(name);
	}
	public String gettext()
	{
		return driver.findElement(Gettext).getText();
		
	}

}
