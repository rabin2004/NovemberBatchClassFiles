package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	// Synchronization => sync between automation script & application as app might take time to load(OS/Browser/Environment/Internet)
		// 1. Static wait -> Thread.sleep(5000); => pause execution for 5 sec
		// 2. Implicit wait -> Dynamic wait/Global wait -> wait till specific defined period for the element to be loaded on which action is being performed, but if found early execute action/predefined frequency to look for element
		// 3. Explicit wait -> Dynamic wait/Local wait -> wait till specific defined period for a specific element to perform action, but if found early execute action/predefined frequency to look for element => WebDriverWait class
				// 3. Fluent wait -> type explicit wait, frequency/polling can also be defined
	
	// PageLoad time out => some period defined to load page
	
	// Implicit wait VS Explicit wait VS Fluent wait

//	A -> 26 seconds load
//	1. implicit wait = 30 sec - 4 sec wasted
//	2. explicit wait = 30 sec - 4 sec wasted	
//	3. Fluent wait = freq/polling => 2 sec - 4 sec saved

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// page load time out
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		//Explicit wait
		WebDriverWait explicitWait = new WebDriverWait(driver, 40);
		WebElement submitBtn = driver.findElement(By.name("submit"));
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		driver.findElement(By.name("userName")).sendKeys("test123");
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		
		
		driver.close();
		

	}

}
