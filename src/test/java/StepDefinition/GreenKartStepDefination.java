package StepDefinition;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import Utils.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GreenKartPage;
import pageObjects.TopDealsPage;

public class GreenKartStepDefination {
	public WebDriver driver;
	public String ProductName;
	GreenKartPage gp;
	TestContextSetUp testcontextsetup;
	
	public GreenKartStepDefination(TestContextSetUp testcontextsetup)
	{
	   this.testcontextsetup=testcontextsetup;
	  this.gp=testcontextsetup.pom.getGreenKartPage();
	}
	
	@Given("User is on Greenkart Landing page")
	public void user_is_on_greenkart_landing_page() throws IOException {
		//testcontextsetup.tb.WebDriverManager();
		Assert.assertTrue(gp.getTitleofGreenkartpage().contains("GreenKart"));
		
	}
	@When("User searches for short name {string} and extracted actual name of product")
	public void user_searches_for_short_name_and_extracted_actual_name_of_product(String string) throws InterruptedException {
		
		//GreenKartPage gp=new GreenKartPage(testcontextsetup.driver);
		gp.SearchItem(string);
		Thread.sleep(2000);
    	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
    	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='products-wrapper']/div/div/h4"))));
		testcontextsetup.ProductName=gp.getSearchText().split("-")[0].trim();
    	System.out.println(testcontextsetup.ProductName);
	}
	@When("^User searches for  name (.+) and extracted actual name of product$")
    public void user_searches_for_name_and_extracted_actual_name_of_product(String name) throws Throwable {	
		gp.SearchItem(name);
		Thread.sleep(2000);
    	
		testcontextsetup.ProductName=gp.getSearchText().split("-")[0].trim();
    	System.out.println(testcontextsetup.ProductName);
    }
	@And("^Added\"([^\"]*)\" items of the selected product to cart$")
    public void addedsomething_items_of_the_selected_product_to_cart(String strArg1) throws Throwable {
      gp.increment(Integer.parseInt(strArg1));
      gp.addtocartbutton();
    }

  
    
}   


