package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardOperationConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		
		// Mouse & Keyboard operation/AJAX operation
		// Mouse operation -> element/action/build/perform
		WebElement loginLink = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Actions action = new Actions(driver); // Actions class
		action.moveToElement(loginLink).build().perform(); // moving to element
		
		Thread.sleep(5000);
		
//		WebElement smeTraveller = driver.findElement(By.linkText("SME Traveller"));
//		action.moveToElement(smeTraveller).click().build().perform(); // moving then clicking the element
		
		WebElement spiceClubMembers = driver.findElement(By.linkText("SpiceClub Members"));
		action.moveToElement(spiceClubMembers).build().perform();
		
		Thread.sleep(5000);
		
		WebElement signUp = driver.findElement(By.linkText("Sign up"));
		action.moveToElement(signUp).click().build().perform();
		
		String expectedURL = "https://book.spicejet.com/Register.aspx";
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		// get() VS navigate()
		// navigate().to() -> will open application
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		driver.navigate().back(); // take back to old application
		Thread.sleep(5000);
		driver.navigate().forward(); // come back to application
		
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		action.sendKeys(Keys.ENTER).build().perform(); // send keyboard keys
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Home")).click();
		
		WebElement userNameTxtField = driver.findElement(By.name("userName"));
		userNameTxtField.sendKeys("Tom123456789");
		Thread.sleep(5000);
		action.moveToElement(userNameTxtField).doubleClick().build().perform(); // double clicking in a field
		Thread.sleep(5000);
		action.contextClick().build().perform(); // right clicking -> click()->left Vs contextClick()->right
		action.click().build().perform();
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.spicejet.com");
		action.sendKeys(Keys.PAGE_DOWN).build().perform(); // page down to see bottom/footer section of the page
		Thread.sleep(5000);
		action.sendKeys(Keys.PAGE_UP).build().perform(); // page up to see top/header section of the page
		
		
		// drag & drop operation -> can only happen within web-application, both draggable and droppable should be in the web-application itself
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		//draggable elements
		WebElement first5000 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]"));
		WebElement second5000 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]"));
		WebElement bank = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		WebElement sales = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[6]"));
		//drop location
		WebElement bankDropLoc = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement first5000DropLoc = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement salesDropLoc = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement second5000DropLoc = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Thread.sleep(5000);
		action.dragAndDrop(first5000, first5000DropLoc).build().perform();
		Thread.sleep(5000);
		action.dragAndDrop(second5000, second5000DropLoc).build().perform();
		Thread.sleep(5000);
		action.dragAndDrop(bank, bankDropLoc).build().perform();
		Thread.sleep(5000);
		action.dragAndDrop(sales, salesDropLoc).build().perform();
		
		// if page gets refreshed: StaleElementReferenceException: stale element reference: element is not attached to the page document
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		// drag and drop without dragAndDrop()
		action.moveToElement(bank).clickAndHold().build().perform(); // hold the element
		action.moveToElement(bankDropLoc).release().build().perform(); // release the element on hold
		
		
		

		Thread.sleep(5000);
		driver.quit();
	}

}
