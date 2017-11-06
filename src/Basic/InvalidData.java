package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidData {

	public static WebDriver driver;
	public static String baseurl = "http://www.demo.guru99.com/V4";
	@Test(priority=1)
	public void TestCase1() {
		//Lauch Browser
		System.setProperty("webdriver.gecko.driver", "C:/Users/Prateek/Desktop/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurl);

		//Verify Login Section with invalid username
		//Verify Login Section with valid credentials
		WebElement name = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.name("btnLogin"));

		name.sendKeys("mngr10181");
		pass.sendKeys("zYtAhAm");
		button.click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"User or Password is not valid");
		driver.switchTo().alert().accept();
		System.out.println("pop up is appered for invalid username");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}
	@Test(priority=2)
	public void TestCase2() {
		//Lauch Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prateek\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurl);

		//Verify Login Section with invalid password
		WebElement name = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.name("btnLogin"));

		name.sendKeys("mngr101816");
		pass.sendKeys("zYtAhA");
		button.click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"User or Password is not valid");
		driver.switchTo().alert().accept();
		System.out.println("pop up is appered for invalid password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}

	@Test(priority=3)
	public void TestCase3() {
		//Lauch Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prateek\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurl);

		//Verify Login Section with invalid password
		WebElement name = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.name("btnLogin"));

		name.sendKeys("mngr1018");
		pass.sendKeys("zYtAhA");
		button.click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"User or Password is not valid");
		driver.switchTo().alert().accept();
		System.out.println("pop up is appered for invalid username and password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}
}
