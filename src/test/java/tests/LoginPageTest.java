
package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginPageTest {

	private WebDriver driver;
	private LoginPage loginPage;

	String userName;
	String password;

	public LoginPageTest(WebDriver driver, LoginPage loginPage) {
		super();
		this.driver = driver;
		this.loginPage = loginPage;
	}

	public void login() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\SubmissionProject\\POMTestDemo\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
		userName = prop.getProperty("userName");
		password = prop.getProperty("password");

		loginPage.userName().sendKeys(userName);
		loginPage.password().sendKeys(password);
		loginPage.signIn().click();

	}

}
