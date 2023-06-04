package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabstestCases {
	@Test(groups = { "Sanity" })
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

	@Test(groups = { "Regression" })
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

	@Test(groups = { "Regression", "Sanity" })
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

	@Test(groups = { "Regression", "Sanity" })
	public void navigateBillingSoftware() throws InterruptedException {

		String url = "http://10.0.61.15:9090/#/login";
		WebDriverManager.chromedriver().setup();
		// ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		// WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passBox = driver.findElement(By.id("password"));
		WebElement projectDropDown = driver.findElement(By.id("projectId"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

		// WebElement iskraLogo =
		// driver.findElement(By.cssSelector("img[alt='Iskraemeco']"));
		// WebElement customerLink = driver.findElement(By.partialLinkText("Customers
		// "));

		wait.until(ExpectedConditions.visibilityOf(userName));
		System.out.println(driver.getTitle());
		userName.sendKeys("admin");
		passBox.sendKeys("admin");
		Select select = new Select(projectDropDown);
		select.selectByVisibleText("Uptown Cairo");
		loginButton.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement customersbutton = driver.findElement(By.xpath("//a[normalize-space()='Customers']"));
		wait.until(ExpectedConditions.visibilityOf(customersbutton));
		customersbutton.click();

		System.out.println(driver.getTitle());
		// Assert.assertEquals(true, customerLink.isDisplayed());
		driver.quit();
	}

	@Test(groups = { "Regression", "Sanity" })
	public void demoAutomationSite() {

		String url = "https://demo.automationtesting.in/Register.html";
		WebDriverManager.chromedriver().setup();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement firsNameBox = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		firsNameBox.sendKeys("Hussam");
		WebElement lastNameBox = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastNameBox.sendKeys("Abd EL Fattah");
		WebElement addressbox = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		wait.until(ExpectedConditions.visibilityOf(addressbox));
		addressbox.sendKeys("21 Emteadad Ramsis 1");
		WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
		emailBox.sendKeys("wow195@gmail.com");
		WebElement phoneNum = driver.findElement(By.cssSelector("input[type='tel']"));
		phoneNum.sendKeys("212-456-7890");
		WebElement genderCheckBox = driver.findElement(By.cssSelector("input[value='FeMale']"));
		wait.until(ExpectedConditions.visibilityOf(genderCheckBox));
		genderCheckBox.click();
		WebElement comboBOX = driver.findElement(By.cssSelector("span[role='combobox']"));
		wait.until(ExpectedConditions.visibilityOf(comboBOX));
		comboBOX.click();
		WebElement comboSearch = driver.findElement(By.cssSelector("span[role='combobox']"));
		wait.until(ExpectedConditions.visibilityOf(comboSearch));
		comboSearch.sendKeys("Den");
		comboSearch.sendKeys(Keys.ENTER);
		WebElement submitButton = driver.findElement(By.id("submitbtn"));
		submitButton.click();

	}

}
