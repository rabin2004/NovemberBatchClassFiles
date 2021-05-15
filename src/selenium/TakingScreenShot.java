package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakingScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// valid credentials => Positive testing
		driver.findElement(By.name("userName")).sendKeys("tom123");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		String expectedLoginMsg = "Login Successfully";
		String actualLoginMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]"))
				.getText();
		
		if(actualLoginMsg.equals(expectedLoginMsg)) {
			System.out.println("Test Passed. Actual result is as expected.");
		}
		else {
			System.out.println("Test failed. Actual result is not as expected.");
			
			// Take screenshot => 1. take screenshot, store as a file 2. convert the file as a picture file
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\User\\Desktop\\eclipse\\NovBatchProject"
					+ "\\src\\selenium\\errorScreenShot.png"));
		}
		
		

	}

}
