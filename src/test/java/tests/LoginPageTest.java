

package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginPageTest{
	
	private WebDriver driver;
	private LoginPage loginPage;
	

	public LoginPageTest(WebDriver driver, LoginPage loginPage) {
		super();
		this.driver = driver;
		this.loginPage = loginPage;
	}
	
	public void login() {
		
		loginPage.userName().sendKeys("mercury");
		loginPage.password().sendKeys("mercury");
		loginPage.signIn().click();
		
	}
	
	

}
