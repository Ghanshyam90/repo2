package Basic;

import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;*/
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;

public class sample {

 
	 @Test
	 public void testcase01(){
		 
	 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/Prateek/Desktop/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.lagosrealestate.com/");

	}
 }

