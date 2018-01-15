package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "input[name='userName']")
	WebElement userName;

	@FindBy(css = "input[name='password']")
	WebElement password;

	@FindBy(css = "input[name='login']")
	WebElement signIn;

	public WebElement userName() {
		return userName;
	}

	public WebElement password() {
		return password;
	}

	public WebElement signIn() {
		return signIn;
	}

}
