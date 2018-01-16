package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
WebDriver driver;
	
	public SelectFlight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//input[@type='radio'][@name='outFlight'])[2]")
	WebElement flight;

	@FindBy(css = "input[name='reserveFlights']")
	WebElement reserveFlight;
	
	public WebElement flight() {
		return flight;
	}

	public WebElement reserveFlight() {
		return reserveFlight;
	}


}
