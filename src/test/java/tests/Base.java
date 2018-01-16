package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	WebDriver driver;

	public WebDriver initializeBrowser() throws IOException {

		
		
		String browserName = FileUtils.getProperty("browser");

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", FileUtils.getFullFilePath("resources/chromedriver.exe"));
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", FileUtils.getFullFilePath("resources/geckodriver.exe"));
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}
}
