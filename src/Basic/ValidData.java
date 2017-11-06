package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidData {
	public static WebDriver driver;
	public static String baseurl = "http://www.demo.guru99.com/V4";
	@Test(priority=1)
	public void FirstDay() {

		//Lauch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prateek\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		//Verify Login Section with valid credentials
		WebElement name = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.name("btnLogin"));

		name.sendKeys("mngr101816");
		pass.sendKeys("zYtAhAm");
		button.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Assert.assertEquals(driver.getCurrentUrl(), "http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		System.out.println("Login Successfully");
		
		driver.quit();

	}
	@Test(priority=2)
	public void SecondDay() {
		//Verify Login Section
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prateek\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		//Enter valid username
		WebElement name = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.name("btnLogin"));

		name.sendKeys("mngr101816");
		pass.sendKeys("zYtAhAm");
		button.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Assert.assertEquals(driver.getCurrentUrl(), "http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		System.out.println("Login Successfully");
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		System.out.println("Home Page Title is verified");
		
		driver.quit();
		
	}
	

}
