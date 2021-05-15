package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioBtnCalenderDropDownCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		
		// RadioButton
//		driver.findElement(By.linkText("Flights")).click();
		
//		WebElement roundTripRadioBtn = driver.findElement(By.xpath("//input[@value='roundtrip']"));
//		WebElement onewayTripRadioBtn = driver.findElement(By.xpath("//input[@value='oneway']"));
//		
//		//1st test -> check default setting?
//		if(roundTripRadioBtn.isSelected()) {
//			System.out.println("Default setting - round trip select. Test pass");
//		}
//		else {
//			System.out.println("Not selected. Test fail");
//		}
//		if(!onewayTripRadioBtn.isSelected()) {
//			System.out.println("Default setting - oneway trip not selected. Test pass");
//		}
//		else {
//			System.out.println("Is selected. Test fail");
//		}
//		
//		onewayTripRadioBtn.click();
//		
//		Thread.sleep(5000);
//		
//		//2nd test -> what if oneway radio button is selected?
//		if(onewayTripRadioBtn.isSelected()) {
//			System.out.println("Oneway trip selected. Test pass");
//		}
//		else {
//			System.out.println("Not selected. Test fail");
//		}
//		if(!roundTripRadioBtn.isSelected()) {
//			System.out.println("Round trip not selected. Test pass");
//		}
//		else {
//			System.out.println("Is selected. Test fail");
//		}
		
		
		// DropDown - handling static dropDown -> use 'Select Class'
//		WebElement passagerCountDropDown = driver.findElement(By.name("passCount"));
//		
//		Select select = new Select(passagerCountDropDown);
//		Thread.sleep(3000);
//		select.selectByIndex(1);
//		Thread.sleep(3000);
//		select.selectByValue("3");
//		Thread.sleep(3000);
//		select.selectByVisibleText("4"); // most commonly used
//		Thread.sleep(3000);
//		
//		WebElement departingCityDropDown = driver.findElement(By.name("fromPort"));
//		Select select1 = new Select(departingCityDropDown);
//		
//		select1.selectByVisibleText("New York");
		
		// Handling checkBox
		
//		driver.get("https://www.spicejet.com/");
//		
//		WebElement studentDiscountChkBx = driver.findElement(By.id("ctl00_mainContent_chk_"
//				+ "StudentDiscount"));
//		
//		
//		System.out.println("Student discount checkbox is default "
//				+ "selected: "+studentDiscountChkBx.isSelected());
//		Thread.sleep(3000);
//		studentDiscountChkBx.click();
//		Thread.sleep(3000);
//		System.out.println("Student discount checkbox is selected after "
//				+ "clicking: "+studentDiscountChkBx.isSelected());
//		studentDiscountChkBx.click();
//		Thread.sleep(3000);
//		System.out.println("Student discount checkbox remains selected after clicking "
//				+ "again: "+studentDiscountChkBx.isSelected());
//		
		driver.get("https://jqueryui.com/datepicker/#date-range");
		
		//iframe -> same frame structure in the application -> to handle any element inside iframe, first is to switch into it
		List<WebElement> numberOfIframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes: "+numberOfIframes.size());
		
//		driver.findElement(By.id("from")).click(); // not able to identify, as the element is inside the frame
		driver.switchTo().frame(numberOfIframes.get(0));
		driver.findElement(By.id("from")).click();
		Thread.sleep(5000);
		
		
		// Handling Calendar
		Select select = new Select(driver.findElement(By.className("ui-datepicker-month")));
		select.selectByVisibleText("Apr");

		driver.findElement(By.xpath("//div[contains(@class,'group-first')]"
				+ "/table/tbody/tr[4]/td[4]")).click(); // 21st April
		Thread.sleep(5000);
		
		driver.close();
	}

}
