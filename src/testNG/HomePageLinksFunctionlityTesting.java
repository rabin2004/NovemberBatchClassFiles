package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageLinksFunctionlityTesting {
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
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void signOnLinkTest() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		Assert.assertEquals(driver.getTitle(), "Sign-0n: Mercury Tours");
	}
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void signOnPageUrlTest() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/test/newtours/login.php");
	}
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void signOnPageMsgTest() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']")).isDisplayed());
	}
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void registerLinkTest() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	}
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void supportLinkTest() {
		driver.findElement(By.linkText("SUPPORT")).click();
		Assert.assertEquals(driver.getTitle(), "Support: Mercury Tours");
	}
	
	@Test (groups= {"Smoke_Test", "Regression_Test"})
	public void contactLinkTest() {
		driver.findElement(By.linkText("CONTACT")).click();
		Assert.assertEquals(driver.getTitle(), "Contact: Mercury Tours");
	}
	
	
}
