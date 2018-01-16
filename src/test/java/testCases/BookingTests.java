package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.BookFlight;
import pageObjects.FlightFinder;
import pageObjects.LoginPage;
import pageObjects.SelectFlight;
import tests.Base;
import tests.BookFlightTest;
import tests.FlightFinderPageTest;
import tests.LoginPageTest;
import tests.SelectFlightPageTest;

public class BookingTests {

	private WebDriver driver;

	@BeforeTest(description = "Instantiates the browser")
	public void prepBrowser() throws IOException {
		Base b = new Base();
		driver = b.initializeBrowser();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

	}

	@Test(priority = 0)
	public void login() throws IOException {

		LoginPage loginPage = new LoginPage(driver);
		LoginPageTest lpt = new LoginPageTest(driver, loginPage);
		lpt.login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}

	@Test(priority = 1)

	public void enterDetails() throws IOException {

		FlightFinder flightFinder = new FlightFinder(driver);
		FlightFinderPageTest ffpt = new FlightFinderPageTest(driver, flightFinder);
		ffpt.selectDetails();
		Assert.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours");
	}

	@Test(priority = 2)

	public void selectFlight() {
		SelectFlight selectFlight = new SelectFlight(driver);
		SelectFlightPageTest sfpt = new SelectFlightPageTest(driver, selectFlight);
		sfpt.select();
	}

	@Test(priority = 3)
	public void bookFlight() {
		BookFlight bookFlight = new BookFlight(driver);
		BookFlightTest bft = new BookFlightTest(driver, bookFlight);
		bft.enterDetails();
		Assert.assertTrue(driver.getPageSource().contains("Your itinerary has been booked!"));
	}

}
