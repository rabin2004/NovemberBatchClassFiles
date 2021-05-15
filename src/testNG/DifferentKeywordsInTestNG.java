package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentKeywordsInTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void loadingBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}
	
	//Keywords in TestNG:
		// priority
	// if order is not defined -> test case will execute in alphabetic order
	// How to define order of execution? => priority = 0/1/2.......
	
		// enabled
	// to escape execution of some test cases => enabled = true/false (true->execute, false->escape)
	
		// dependsOnMethods
	// to create dependency between test cases -> multiple dependencies can be created/ if any one fails the depended method is going to be skipped
	
		// timeOut
	// wait time can be defined for specific test case => timeOut = 5000ms
	
	@Test (priority = 7, enabled = true, timeOut = 10000)
	public void signOnFromHomePage() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		WebElement actualLoginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']"));
		Thread.sleep(9000);
		Assert.assertTrue(actualLoginSuccessMsg.isDisplayed());
	}
	
	@Test (priority = 8, enabled = true, timeOut = 10000, 
			dependsOnMethods = {"signOnFromHomePage", "signOnPageTitleVerification", "signOnPageUrlVerification"})
	public void signOnFromSignOnPage() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		WebElement actualLoginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']"));
		
		Assert.assertTrue(actualLoginSuccessMsg.isDisplayed());
	}
	
	@Test(priority = 5, enabled = true)
	public void homePageTitleVerification() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Welcome: Mercury Tours";
		
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	
	@Test(priority = 6, enabled = true)
	public void homePageUrlVerification() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/index.php";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority = 0, enabled = true)
	public void signOnPageTitleVerification() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sign-on: Mercury Tours";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 1, enabled = true)
	public void signOnPageUrlVerification() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/login.php";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority = 3, enabled = true)
	public void registerPageTitleVerification() {
		driver.findElement(By.linkText("REGISTER")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register: Mercury Tours";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 4, enabled = true)
	public void registerPageUrlVerification() {
		driver.findElement(By.linkText("REGISTER")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register.php";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}

}
