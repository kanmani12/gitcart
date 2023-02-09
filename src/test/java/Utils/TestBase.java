package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	//public String browser;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String Browser_properties=pro.getProperty("Browser");
		String Browser_maven=System.getProperty("Browser");
		String Browser=Browser_maven!=null?Browser_maven:Browser_properties;
		
		String url=pro.getProperty("url");
		
		if(driver==null)
			
		{
		if(Browser.equalsIgnoreCase("chromedriver"))		
		{
			//WebDriverManager.chromedriver().setup();
		    //System.setProperty(BrowserName,"D:\\eclipse-workspace\\Jars\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}else if(Browser.equalsIgnoreCase("firefoxdriver"))
		{
		
			driver=new FirefoxDriver();
			
			
		}else if(Browser.equalsIgnoreCase("edgedriver"))
		{
				
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(url);
			
		
	
	}
		return driver;
}
}
