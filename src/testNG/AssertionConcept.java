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

public class AssertionConcept {
	
	// Assertion -> creating Validation point
	// Verification Vs Validation
	// Verification point -> conditions (if/else if/else) -> not passing or failing test case -> script error, then rest of the code not going to execute (not using TestNG)
	// Validation point -> will pass or fail based on assertion/validate -> either test is failed/passed or error in code => rest of the test case will still execute
	// Assertion -> 
	
	
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
	
	@Test (groups= {"End-to-End_Test", "Regression_Test"})// Test cases
	public void positiveLoginTest() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		//assertion
		String expectedLoginSuccessURL = "http://demo.guru99.com/test/newtours/login_sucess.php"; // FRDs/BRDs
		String actualLoginSuccessURL = driver.getCurrentUrl();
		
		// verification point
//		if(actualLoginSuccessURL.equals(expectedLoginSuccessURL)) {
//			System.out.println("Test passed");
//		}else {
//			System.out.println("Test failed");
//		}
		
		// validation point-> assertEquals(actual,expected), assertTrue(), assertFalse()
		Assert.assertEquals(actualLoginSuccessURL, expectedLoginSuccessURL); // comparing acutal vs expected
		
		WebElement actualLoginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']"));
		
		// assertTrue() -> true/false, if true->pass/if false->fail
		Assert.assertTrue(actualLoginSuccessMsg.isDisplayed());
		
		// assertFalse() -> true/false, if false->pass/if true->fail
//		Assert.assertFalse(actualLoginSuccessMsg.isDisplayed());
		
		
	}
	
	@Test (groups= {"End-to-End_Test", "Regression_Test"})// Test cases
	public void negativeLoginTest() {
		driver.findElement(By.name("userName")).sendKeys("tom12");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		String expectedErrorMsg = "Enter your userName and password correct";
		WebElement errorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		
		Assert.assertEquals(errorMsg.getText(), expectedErrorMsg);
		Assert.assertTrue(errorMsg.isDisplayed());
		Assert.assertTrue(driver.findElement(By.name("submit")).isEnabled());
		
		
		
	}
	
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}
	
	

}
