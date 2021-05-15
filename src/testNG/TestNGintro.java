package testNG;

public class TestNGintro {
	
	// Path to get TestNG = http://dl.bintray.com/testng-team/testng-eclipse-release/
	
	// Problems -> 1. Test case demarcation (main method) 2. Report 3. Repetition 4. Data driven 5. No Validation point 6. Execution more than one class/packages 7. Cross browser/Parallel testing
	// TestNG|Junit
	// TestNG tool -> automation tool -> TDD(Test Driven Development framework) -> framework | annotation | Report | Assertion | XML file
	
	// TestNG Annotation: 
	// Pre-requisite annotation: @Before
	// Post-requisite annotations: @After
	// Scope of @Before & @After is within test folder only, no matter there is another test folder or not
	// @BeforeSuite & @AfterSuite - executes before the all the test within the suite starts and after the all the test executes is     completed within the suite, no matter how many test folder is     present
	// @BeforeMethod & @AfterMethod - scope is within the class it is specified and will execute before every test within the specific class
	// @BeforeTest & @AfterTest - scope is within the test in xml file and will execute before test method
	// @BeforeClass - scope is with the class and execute before executing any test within the class
	// @AfterClass - scope is with the class and execute after executing all the test within the class
	// @BeforeGroups & @AfterGroups
	
	// @Test - to write test case

}
