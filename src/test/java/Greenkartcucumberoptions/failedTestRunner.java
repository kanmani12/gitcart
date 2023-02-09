package Greenkartcucumberoptions;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenarios.txt",glue="StepDefinition",
//tags="@offerpage or @placeorder",
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/failedtestreport.html"})

public class failedTestRunner extends AbstractTestNGCucumberTests {
	
	
	  @Override
	  
	  @DataProvider(parallel=true) public Object[][] scenarios()
	  { 
		  return super.scenarios(); 
		  }
	 
	

}
