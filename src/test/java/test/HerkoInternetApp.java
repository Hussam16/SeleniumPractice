package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerkoInternetApp {

	public static WebDriver driver;
	private String url = "https://the-internet.herokuapp.com/";

	@Test()
	public void ClickKeysTestcases() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("Key Presses")).click();
		driver.findElement(By.id("target")).sendKeys("A" + Keys.BACK_SPACE);
		driver.close();

	}

	@Test()
	public void ClickKeysTestSlider() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("Horizontal Slider")).click();
		driver.findElement(By.cssSelector("input[type='range']")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.cssSelector("input[type='range']")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.cssSelector("input[type='range']")).sendKeys(Keys.ARROW_RIGHT);
		driver.close();

	}

	@Test
	public void HandleAlertTestcases() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		driver.close();

	}

	@Test
	public void HandleAlertTestcasesTwoChocic() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.close();

	}

	@Test()
	public void HandleAlertTestcasesTwoPromot() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.close();

	}

	@Test
	public void HandleAlertTestcasesSendText() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Text Lorem");
		driver.switchTo().alert().accept();
		driver.close();

	}

	@Test
	public void HandleFileUpload() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("File Upload")).click();
		String filePath=System.getProperty("user.dir")+"\\Pre-requites.txt";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		driver.close();


	}
	@Test
	public void HandleFrameSwitching() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.get(url);
		driver.findElement(By.linkText("WYSIWYG Editor")).click();
		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame);
		driver.findElement(By.tagName("p")).clear();
		driver.findElement(By.tagName("p")).sendKeys("Loreem sdasd");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//button[@role='menuitem'])[1]")).click();

		driver.close();


	}
	@Test
	public void HandleDynamicLoading() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='Hello World!']"))));
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
		driver.navigate().back();
		driver.navigate().back();


		driver.close();


	}
	
	@Test
	public void HandleNavgation() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='Hello World!']"))));
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
		driver.navigate().back();
		driver.navigate().back();
		driver.close();
		


	}
	
	

}
