package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabstestCases {
	@Test(groups = {"Sanity"})
	public void navigateSacuceLabsHomepage() {

		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test(groups = {"Regression"})
	public void navigateSacuceLabsHomepage2() {

		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	@Test(groups = {"Regression","Sanity"})
	public void navigateSacuceLabsHomepage3() {

		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
