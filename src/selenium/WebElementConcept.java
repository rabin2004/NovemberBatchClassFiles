package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	// WebElement/WebObject/GUI object/element => eveything present in the web application to interact with user
	// Types of webElement -
			// 1. Text field/Text area - user can type something -> can perform action -> click & type -> letters can be visible or masked
			// 2. Button - enter or click action -> enabled or disabled
			// 3. Link/hyperLink - click action -> take user to page of same application or foreign application
			// 4. CheckBox - click action -> one click, object gets selected , double click object gets deselected -> user would be able to select one or more option
			// 5. RadioButton - click action -> user can only select one option -> default selection
			// 6. List Box/DropDown box - click action -> more options will displayed and can be selected with click action
			// 7. Table - interactive table or informative table -> interactive table - click or type actions
			// 8. Menus - click action
			// 9. Images - interactive image or informative image -> interactive image -> click action

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// findElement() => find GUI element and sendKeys() => type some value in it
		driver.findElement(By.name("userName")).sendKeys("test12");
		driver.findElement(By.name("password")).sendKeys("123");
		
		// click() - to click on an element
		driver.findElement(By.name("submit")).click();
	}

}
