package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithTestNG {

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
	
	@Test(dataProvider = "positive login test data", groups= {"End-to-End_Test", "Regression_Test"})
	public void positiveLoginTest(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		WebElement actualLoginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']"));
		
		Assert.assertTrue(actualLoginSuccessMsg.isDisplayed());
	}
	
	@Test (dataProvider = "negativeLoginTestData", groups= {"End-to-End_Test", "Regression_Test"})
	public void negativeLoginTest(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));

		Assert.assertTrue(errorMsg.isDisplayed());
	}
	
	@DataProvider (name ="positive login test data")
	public Object[][] getData() {
//		Object[][] data = new Object[3][2]; 
//		data[0][0] = "test12";
		Object[][] data = {{"test123", "123"}, {"test", "123"}, {"test123", "123"}, {"test", "123"}};
		return data;
	}
	
	@DataProvider
	public Object[][] negativeLoginTestData() {
		Object[][] data = {{"tom12","12345"},{"david12","12345"},{"john12","12345"},{"harry12","12345"}};
		return data;
	}
	
	// Assignment: ->with @DataProvider annotations
		// 1. Data driven testing of Amazon.com search functionality 10 different product and valid the search result
		// 2. Data driver tesing win Google.com search functionality 10 different keyword and valid the search result
	
	
	
	
	
	
}
