package tests;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BookFlight;


public class BookFlightTest {
	private WebDriver driver;
	private BookFlight bookFlight;
	String fName;
	String lName;
	String creditCardNumber;
	

	public BookFlightTest(WebDriver driver, BookFlight bookFlight) {
		super();
		this.driver = driver;
		this.bookFlight = bookFlight;
	}
	
	public void enterDetails() {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\SubmissionProject\\POMTestDemo\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
		fName = prop.getProperty("firstName");
		lName = prop.getProperty("lastName");
		creditCardNumber = prop.getProperty("creditCardNumber");
	
		
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
