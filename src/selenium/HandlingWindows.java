package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		// get window handle
//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println(parentWindowHandle);
		
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();
		
//		String handle = driver.getWindowHandle();
//		System.out.println(handle);
		
//		System.out.println(parentWindowHandle.equals(handle));
		
		
		// get window handle of multiple windows opened 
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of windows opened: "+handles.size());
		
		Iterator<String> it = handles.iterator();
		
//		System.out.println("Parent window handle: "+it.next());
//		System.out.println("Child window handle: "+it.next());
		
		// Switched into parent window
		driver.switchTo().window(it.next());
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window: "+parentWindowHandle);
		
//		// Switched into child window
		driver.switchTo().window(it.next());
		String childWindowHandle = driver.getWindowHandle();
		System.out.println("Child window: "+childWindowHandle);
//		
		// perform action in child window - need to switch into child window first
//		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("btnLogin")).click();
//		
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]")).getText());
		
		// loop concept to perform generalized action
		while(it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			driver.close();
		}
		
		
//		Thread.sleep(5000);
//		driver.close(); // close() -> will close browser in focus
		
//		Thread.sleep(5000);
//		driver.switchTo().window(parentWindowHandle);
//		driver.close();
		
		driver.quit(); // close() Vs quit() => will close all the window opened by the browser instance

	}

//	Assignment:
//		1. Handling radioButton/checkBox/dropDown/Calendar/Table/Frame/Alert/Window
	
}
