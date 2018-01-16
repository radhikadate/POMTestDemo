package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import pageObjects.BookFlight;

public class BookFlightTest {

	private BookFlight bookFlight;
	String fName;
	String lName;
	String creditCardNumber;

	public BookFlightTest(BookFlight bookFlight) {
		super();

		this.bookFlight = bookFlight;
	}

	public void enterDetails() throws IOException {

		fName = FileUtils.getProperty("firstName");
		lName = FileUtils.getProperty("lastName");
		creditCardNumber = FileUtils.getProperty("creditCardNumber");

		for (WebElement firstName : bookFlight.firstName()) {

			firstName.sendKeys(fName);

		}
		for (WebElement lastName : bookFlight.lastName()) {

			lastName.sendKeys(lName);

		}
		bookFlight.cardNumber().sendKeys(creditCardNumber);
		bookFlight.ticketLess().click();
		bookFlight.purchaseButton().click();

	}
}
