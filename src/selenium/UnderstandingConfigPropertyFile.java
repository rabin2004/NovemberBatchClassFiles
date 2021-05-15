package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingConfigPropertyFile {
	
	// Hard coding in script: 1. Browser 2. URL 3. login Credentials 4. Int values for pageLoad & Implicit wait
	// Norms followed: 
	// 1. Reusability of Script
	// 2. As minimal hard coding possible
	// 3. Global variables & other variables are handled -> Property file

	public static void main(String[] args) throws IOException, InterruptedException {
		// Handling config.properties file
		// Instance of Properties class
		Properties prop = new Properties();
		// Instance of FileInputStream
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse\\NovBatchProject"
				+ "\\src\\selenium\\config.properties");
		prop.load(file);
		
		System.setProperty(prop.getProperty("keyChrome"), prop.getProperty("chromePath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url")); // Dev Environment URL | QA Environment URL | UAT Environment URL | Production Environment URL
		Thread.sleep(5000);
		
		// positive login functionality test
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.getTitle());

		Thread.sleep(5000);
		driver.close();
	}

}
