package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.FlightFinder;
import pageObjects.LoginPage;

public class FlightFinderPageTest {
	private WebDriver driver;
	private FlightFinder flightFinder;
	

	public FlightFinderPageTest(WebDriver driver, FlightFinder flightFinder) {
		super();
		this.driver = driver;
		this.flightFinder = flightFinder;
	}
	
	public void selectDetails() {
		flightFinder.oneWay().click();
		Select passengers = new Select(flightFinder.passengers());
		passengers.selectByVisibleText(passCount);
		Select from = new Select(flightFinder.from());
		from.selectByVisibleText(origin);
		Select to = new Select(flightFinder.to());
		to.selectByVisibleText(destination);
		
	}
}
