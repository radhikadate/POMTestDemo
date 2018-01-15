package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.FlightFinder;
import pageObjects.LoginPage;
import tests.Base;
import tests.FlightFinderPageTest;
import tests.LoginPageTest;


public class BookingTests {

	
	private WebDriver driver;
	
	@BeforeTest(description="Instantiates the browser")
	public void prepBrowser() throws IOException {
		Base b= new Base();
		driver=b.initializeBrowser();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
	}
	
	@Test(priority=0)
	public void login() throws IOException {

		LoginPage loginPage = new LoginPage(driver);
		LoginPageTest lpt= new LoginPageTest(driver, loginPage);
		lpt.login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}
	
	@Test(priority=1)
	
	public void enterDetails(String passCount, String origin, String destination) {
		
		FlightFinder flightFinder= new FlightFinder(driver);
		FlightFinderPageTest ffpt= new FlightFinderPageTest(driver, flightFinder);
		ffpt.selectDetails();
	}
	
	
	
}
