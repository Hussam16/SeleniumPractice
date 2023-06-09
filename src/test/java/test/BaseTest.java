package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	HomePage homepage;

	@Parameters("browserName")
	@BeforeClass
	public void Setup(String browserName) {
		

		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			// chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			homepage= new HomePage(driver);
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new FirefoxDriver(firefoxOptions);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			homepage= new HomePage(driver);
			
		}


	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
