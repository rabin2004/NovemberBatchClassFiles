package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFirstScript {
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
	
	@Test // Test cases
	public void positiveLoginTest() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
	}
	
	@Test // Test cases
	public void negativeLoginTest() {
		driver.findElement(By.name("userName")).sendKeys("tom12");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
	}
	
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}
	
	

}
