package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
	
WebDriver driver;
	
	public FlightFinder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="input[value='oneway']")
	WebElement oneWay;
	
	@FindBy(css="select[name='fromPort']")
	WebElement from;
	
	@FindBy(css="select[name='passCount']")
	WebElement passengers;
	
	@FindBy(css="select[name='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(css="select[name='fromDay']")
	WebElement fromDay;
	
	@FindBy(css="select[name='toPort']")
	WebElement to;
	
	@FindBy(css="select[name='toMonth']")
	WebElement toMonth;
	
	@FindBy(css="select[name='toDay']")
	WebElement toDay;
	
	@FindBy(css="input[value='First']")
	WebElement firstClass;
	
	@FindBy(css="input[name='findFlights']")
	WebElement continueButton;
	
	public WebElement from() {
		return from;
	}
	
	public WebElement oneWay() {
		return oneWay;
	}
	
	public WebElement passengers() {
		return passengers;
	}
	
	public WebElement fromMonth() {
		return fromMonth;
	}
	
	public WebElement fromDay() {
		return fromDay;
	}
	
	public WebElement to() {
		return to;
	}
	
	public WebElement toMonth() {
		return toMonth;
	}
	
	public WebElement toDay() {
		return toDay;
	}
	
	public WebElement firstClass() {
		return firstClass;
	}
	
	public WebElement continueButton() {
		return continueButton;
	}
	

}
