
package tests;

import java.io.IOException;

import pageObjects.LoginPage;

public class LoginPageTest {

	private LoginPage loginPage;

	String userName;
	String password;

	public LoginPageTest(LoginPage loginPage) {
		super();
		this.loginPage = loginPage;
	}

	public void login() throws IOException {

		userName = FileUtils.getProperty("userName");
		password = FileUtils.getProperty("password");

		loginPage.userName().sendKeys(userName);
		loginPage.password().sendKeys(password);
		loginPage.signIn().click();

	}

}
