package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchwindowtochild()
	{
		 Set<String> Windows=driver.getWindowHandles();
		  Iterator<String> it= Windows.iterator();
		  it.next();
		  String Child=it.next();
		  driver.switchTo().window(Child); 
		  
	}

}
