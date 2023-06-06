package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static WebDriver driver;
	private String url = "https://opensource-demo.orangehrmlive.com/";

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);

		WebElement userNameBox = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement PasswrodBox = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

		userNameBox.sendKeys("Admin");
		PasswrodBox.sendKeys("admin123");
		loginButton.click();
		WebElement adminLink = driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewAdminModule']"));
		adminLink.click();

	}

	@Test(groups = { "Sanity" })
	public void AdminUserMangementTable() {

		int numberOfrow = driver.findElements(By.xpath("//div[@role='row']")).size() - 1;
		int numberOfCloumns = driver.findElements(By.xpath("//div[@role='columnheader']")).size();

		
		for (int i = 2; i <= numberOfrow * numberOfCloumns; i += numberOfCloumns) {
			

			String adminName = driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[" + i + "]")).getText();

			if (adminName.equalsIgnoreCase("Alice.Duval")) {
				
				System.out.println("Olayyyyy!");
				driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[" + (i-1) + "]")).click();
				
			}

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
