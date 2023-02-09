package StepDefinition;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import Utils.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import pageObjects.TopDealsPage;

public class TopDealsStepDefination {

	public String Dealsproduct;
	TestContextSetUp testcontextsetup;
	PageObjectManager pom;
	public TopDealsStepDefination(TestContextSetUp testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	  @Then("User searches for same short name {string} in Top Deals page")
	  public void user_searches_for_same_short_name_in_top_deals_page(String string) throws InterruptedException {
		  
		  
		 // pom=new PageObjectManager(testcontextsetup.driver);
		  TopDealsPage tp=testcontextsetup.pom.getTopDealsPage();
		  tp.clickingtopdealslink();
		  testcontextsetup.gut.switchwindowtochild();
	 
	  tp.searchitem(string);
	
	  Thread.sleep(2000);
	  
	  testcontextsetup.Dealsproduct=tp.gettext();
	
	  System.out.println(testcontextsetup.Dealsproduct);
	  }

	    @Then("^User searches for same name (.+) in Top Deals page$")
	    public void user_searches_for_same_name_in_top_deals_page(String name) throws Throwable {
			  TopDealsPage tp=testcontextsetup.pom.getTopDealsPage();
			  tp.clickingtopdealslink();
			  testcontextsetup.gut.switchwindowtochild();
		 
		  tp.searchitem(name);
		
		  Thread.sleep(2000);
		  
		  testcontextsetup.Dealsproduct=tp.gettext();
		
		  System.out.println(testcontextsetup.Dealsproduct);
	    }

	
	  
	  @Then("Validate product name in top Deals page matches with Landing page")
	  public void validate_product_name_in_top_deals_page_matches_with_landing_page() throws IOException {
		  Assert.assertEquals(testcontextsetup.Dealsproduct,testcontextsetup.ProductName);
		
	  }
	 

}
