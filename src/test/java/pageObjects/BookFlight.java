package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlight {

	WebDriver driver;

	public BookFlight(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.cssSelector("input[name*='passFirst']");
	By lastName = By.cssSelector("input[name*='passLast']");
	By cardNumber = By.cssSelector("input[name='creditnumber']");
	By ticketLess = By.cssSelector("input[name='ticketLess']");
	By purchaseButton = By.cssSelector("input[name='buyFlights']");

	public List<WebElement> firstName() {
		return driver.findElements(firstName);
	}

	public List<WebElement> lastName() {
		return driver.findElements(lastName);
	}

	public WebElement cardNumber() {
		return driver.findElement(cardNumber);
	}
	
	public WebElement ticketLess() {
		return driver.findElement(ticketLess);
	}
	
	public WebElement purchaseButton() {
		return driver.findElement(purchaseButton);
	}
}
