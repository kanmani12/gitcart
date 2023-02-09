package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utils.TestContextSetUp;
//import Utils.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetUp testcontextsetup;

	
	 public Hooks(TestContextSetUp testcontextsetup) 
	 {
		
	  this.testcontextsetup=testcontextsetup;
	  }
	 
	@After
	public void AfterScenario() throws IOException
	{
		  testcontextsetup.tb.WebDriverManager().quit();
		
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver=testcontextsetup.tb.WebDriverManager();
		if(scenario.isFailed())
		{
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent=  FileUtils.readFileToByteArray(src);
		scenario.attach(filecontent, "image/png", "image");
		}
	}

}
