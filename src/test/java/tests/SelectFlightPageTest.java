package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.SelectFlight;;

public class SelectFlightPageTest {
	
	private WebDriver driver;
	private SelectFlight selectFlight;
	

	public SelectFlightPageTest(WebDriver driver, SelectFlight selectFlight) {
		super();
		this.driver = driver;
		this.selectFlight = selectFlight;
	}
	
	public void select() {
		selectFlight.flight().click();
		selectFlight.reserveFlight().click();
	}
}
