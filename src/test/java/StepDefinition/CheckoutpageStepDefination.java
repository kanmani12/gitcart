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
import pageObjects.checkoutpage;

public class CheckoutpageStepDefination {
	public WebDriver driver;
	public String ProductName;
	public String cartproduct;
	public  checkoutpage cp;
	TestContextSetUp testcontextsetup;
	
	public CheckoutpageStepDefination(TestContextSetUp testcontextsetup)
	{
	   this.testcontextsetup=testcontextsetup;
	   this.cp =testcontextsetup.pom.getcheckoutpage();
	}
	@Then("^User proceeds to checkout and validate the (.+) items is in checkout page$")
    public void user_proceeds_to_checkout_and_validate_the_items_is_in_checkout_page(String name) throws Throwable {
	    	cp.clickcartbutton();
	    	//Thread.sleep(3000);
	    	testcontextsetup.cartproduct=cp.cartproductvalidation().split("-")[0].trim();
	    	System.out.println(testcontextsetup.cartproduct);
	    	Assert.assertEquals(testcontextsetup.cartproduct, testcontextsetup.ProductName);
	       
	    }


	    @And("^verify user has ability to enter promocode and place the order$")
	    public void verify_user_has_ability_to_enter_promocode_and_place_the_order() throws Throwable {
	       
	        Assert.assertTrue(cp.validateplaceoderbutton());
	        Assert.assertTrue(cp.validateprmocodebutton());
	    }
	
	
	

  
    
}   


