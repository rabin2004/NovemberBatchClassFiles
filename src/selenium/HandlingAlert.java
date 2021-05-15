package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	
	// Alert msg/AlertPopUp/PopUp/Java PopUp/Static PopUp

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");

		// webElement creation
		WebElement customerIDtxtField = driver.findElement(By.name("cusid"));
		WebElement submitBtn = driver.findElement(By.name("submit"));
		WebElement resetBtn = driver.findElement(By.name("res"));
		
		//Defining Actions
		customerIDtxtField.sendKeys("Test123");
		Thread.sleep(5000);
		submitBtn.click();
		Thread.sleep(5000);
		
		//handling alert -> switchTo().alert()
		String alertMsg1 = driver.switchTo().alert().getText(); // get String from the alert/pop box
		System.out.println("Displayed Alert Msg 1: "+alertMsg1);
		
		driver.switchTo().alert().dismiss(); // to click Cancel/No/Dismiss
		resetBtn.click();
		
		customerIDtxtField.sendKeys("Selenium123");
		Thread.sleep(5000);
		submitBtn.click();
		
		String alertMsg1again = driver.switchTo().alert().getText(); // get String from the alert/pop box
		System.out.println("Displayed Alert Msg 1: "+alertMsg1);
		
		driver.switchTo().alert().accept(); // to click Ok/Yes/Accept
		
		Thread.sleep(5000);
		
		String alertMsg2 = driver.switchTo().alert().getText();
		System.out.println("Displayed Alert Msg 2: " + alertMsg2);
		
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
