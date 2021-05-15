package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// Expected result from requirement/user stories/features - FRDs/BRDs
		String expectedTxt = "Registered users can sign-in here to find the lowest fare on "
				+ "participating airlines.";
		
		WebElement actualElement = driver.findElement(By.xpath("//table[@width='192']/tbody/tr[4]"
				+ "/td/table/tbody/tr[1]"));
		
		if(actualElement.isDisplayed()) {
		String actualTxt = actualElement.getText();
		
		if(actualTxt.equals(expectedTxt)) {
			System.out.println("Txt according to requirement. Test passed.");
		}
		else {
			System.out.println("Txt not according to requirement. Test failed.");
		}
		}
		else{
			System.out.println("Actual Text not displayed.");
		}
		
		driver.close();
		
	}

}
