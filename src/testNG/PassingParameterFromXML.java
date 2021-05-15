package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameterFromXML {
	WebDriver driver;
	
	@Parameters({"ChromeKey","ChromePath","URL"})
	@BeforeMethod
	public void loadBrowser(String chromeKey, String chromePath, String url) {
		System.setProperty(chromeKey, chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);	
	}
	
	@AfterMethod
	public void closeBroser() {
		driver.close();
	}
	
	@Test(dataProvider="positive login data")
	public void positiveLoginTest(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']")).isDisplayed());
	}
	
	@DataProvider (name="positive login data")
	public Object[][] testData() {
		Object[][] data = {{"test123","123"},{"test","123"}};
		return data;
	}

}
