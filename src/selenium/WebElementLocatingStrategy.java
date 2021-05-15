package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocatingStrategy {
	
	// WebElement locating Strategy -
				// 1. Name - 1st choice, most common, mostly unique in nature
				// 2. ID - 1st choice, most common, mostly unique in nature
				// 3. ClassName - not unique, used with some other attribute
				// 4. LinkText - for links
				// 5. Partial LinkText - part of link if linkText is very long
				// 6. Xpath - common and very useful strategy if other strategy don't work, cutomization
				// 7. Css selector - common and very useful strategy if other strategy don't work, cutomization
				// 8. TagName - not specific, used to identify group of elements
		
			// Each webElement will have - 
					// 1. TagName
					// 2. Attributes
					// 3. Attributes will have values
					// 4. Text, not all the time

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize() => to maximize window size
//		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// name
//		WebElement userName = driver.findElement(By.name("userName"));
//		userName.sendKeys("test123"); // sending values
//		userName.clear(); // clear values in it
//		System.out.println("Username txt field is enabled: "+userName.isEnabled()); // if functional or not, boolean output
//		System.out.println("Username txt field is displayed: "+userName.isDisplayed()); // if displayed or not, boolean output
		
		// linkText
//		WebElement signOnLink = driver.findElement(By.linkText("SIGN-ON"));
//		System.out.println("Sign on link text is displayed: "+signOnLink.isDisplayed());
//		System.out.println("Sign on link text is enabled: "+signOnLink.isEnabled());
//		System.out.println("Sign on link text is selected: "+signOnLink.isSelected()); // if element is selected (checkBox/radioButton)
		
		// homepage before clicking link
//		System.out.println("Title of home page: "+driver.getTitle()); 
//		System.out.println("Current url of the home page: "+driver.getCurrentUrl());
		
//		signOnLink.click(); // clicking link
		
		// sign on page after clicking
//		System.out.println("Title of sign on page: "+driver.getTitle()); // to get the title of the page
//		System.out.println("Current url of the sign on page: "+driver.getCurrentUrl()); // to get the url of the page
		
		// partial linkText
//		driver.findElement(By.partialLinkText("Business Travel")).click();
//		System.out.println("Business travel page: "+driver.getTitle());
		
		// findElement() VS findElements() = ???
		
		// tagName -> tagName for linkText=>'a' | tagName for images=>'img' | tagName for txtField/button=>'input'
//		List<WebElement> linksInHomePage = driver.findElements(By.tagName("a")); // findElements() => locate more than 1 element
//		System.out.println("Number of links in HomePage: "+linksInHomePage.size());
//		System.out.println("First link: "+linksInHomePage.get(0).getAttribute("href")); // getAttribute() => extract value pointed by the attribute
//		System.out.println("Second link: "+linksInHomePage.get(1).getAttribute("href"));
//		
//		List<WebElement> imagesInHomePage = driver.findElements(By.tagName("img"));
//		System.out.println("Number of images in HomePage: "+imagesInHomePage.size());

		driver.get("https://www.amazon.com/");
		
		//ID
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
//		Thread.sleep(5000);
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("Url after search: "+driver.getCurrentUrl());
		
		//className
//		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("apple"); // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
//		driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
//		System.out.println("Url after search: "+driver.getCurrentUrl());
		
		//Xpath
//		driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("apple"); // copying Xpath from DOM => might be able to identify element
//		driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[2]/div/"
//				+ "form/div[3]/div/span/input")).click(); // not able to identify element
//		driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();	
//		System.out.println("Url after search: "+driver.getCurrentUrl());
		
		//Css selector
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("apple");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		System.out.println("Url after search: "+driver.getCurrentUrl());
		
		Thread.sleep(5000); // pausing execution for 5 sec (5000 milliseconds)
		driver.close(); // close() => close browser in action
	}
	
	// Assignment:
		// 1. any application => identify element with all 9 strategy 
		// 2. perform various actions -> click(),sendKey(),isEnabled(), isDisplayed(), isSelected(), getCurrentUrl(), getTitle(), findElement(), findElements()
		// 3. close() & maximize()

}
