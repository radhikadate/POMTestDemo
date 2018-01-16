package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.FlightFinder;
import pageObjects.LoginPage;

public class FlightFinderPageTest {
	private WebDriver driver;
	private FlightFinder flightFinder;
	
	String passCount;
	String origin;
	String destination;
	String startMonth;
	String startDate;
	

	public FlightFinderPageTest(WebDriver driver, FlightFinder flightFinder) {
		super();
		this.driver = driver;
		this.flightFinder = flightFinder;
	}
	
	public void selectDetails() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\SubmissionProject\\POMTestDemo\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
		passCount = prop.getProperty("passCount");
		origin = prop.getProperty("origin");
		destination = prop.getProperty("destination");
		startMonth = prop.getProperty("startMonth");
		startDate = prop.getProperty("startDate");
		
		flightFinder.oneWay().click();
		Select passengers = new Select(flightFinder.passengers());
		passengers.selectByVisibleText(passCount);
		Select from = new Select(flightFinder.from());
		from.selectByVisibleText(origin);
		Select to = new Select(flightFinder.to());
		to.selectByVisibleText(destination);
		Select fromMonth= new Select(flightFinder.fromMonth());
		fromMonth.selectByVisibleText(startMonth);
		Select fromDay= new Select(flightFinder.fromDay());
		fromDay.selectByVisibleText(startDate);
		
		flightFinder.firstClass().click();
		flightFinder.continueButton().click();
		
		
	}
}
