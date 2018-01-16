package tests;

import pageObjects.SelectFlight;;

public class SelectFlightPageTest {

	private SelectFlight selectFlight;

	public SelectFlightPageTest(SelectFlight selectFlight) {
		super();
		this.selectFlight = selectFlight;
	}

	public void select() {
		selectFlight.flight().click();
		selectFlight.reserveFlight().click();
	}
}
