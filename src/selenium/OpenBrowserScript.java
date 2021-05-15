package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserScript {

	public static void main(String[] args) {
		
		//set property for driver
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		// creating object of chromeDriver
		WebDriver driver = new ChromeDriver();
		
		// open url/website
		driver.get("https://www.gmail.com");
	}

}
