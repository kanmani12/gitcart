package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import StepDefinition.Hooks;
import pageObjects.PageObjectManager;

public class TestContextSetUp {
	public WebDriver driver;
	public String ProductName;
	public String Dealsproduct;
	public PageObjectManager pom;
	public TestBase tb;
	public GenericUtils gut;
	public String cartproduct;

	public TestContextSetUp() throws IOException
	{
		
		tb=new TestBase();
		pom=new PageObjectManager(tb.WebDriverManager());
		gut=new GenericUtils(tb.WebDriverManager());
	}
	

}
