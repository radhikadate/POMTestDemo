package tests;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import pageObjects.FlightFinder;

public class FlightFinderPageTest {

	private FlightFinder flightFinder;

	String passCount;
	String origin;
	String destination;
	String startMonth;
	String startDate;

	public FlightFinderPageTest(FlightFinder flightFinder) {
		super();
		this.flightFinder = flightFinder;
	}

	public void selectDetails() throws IOException {

		passCount = FileUtils.getProperty("passCount");
		origin = FileUtils.getProperty("origin");
		destination = FileUtils.getProperty("destination");
		startMonth = FileUtils.getProperty("startMonth");
		startDate = FileUtils.getProperty("startDate");

		flightFinder.oneWay().click();
		Select passengers = new Select(flightFinder.passengers());
		passengers.selectByVisibleText(passCount);
		Select from = new Select(flightFinder.from());
		from.selectByVisibleText(origin);
		Select to = new Select(flightFinder.to());
		to.selectByVisibleText(destination);
		Select fromMonth = new Select(flightFinder.fromMonth());
		fromMonth.selectByVisibleText(startMonth);
		Select fromDay = new Select(flightFinder.fromDay());
		fromDay.selectByVisibleText(startDate);

		flightFinder.firstClass().click();
		flightFinder.continueButton().click();

	}
}
