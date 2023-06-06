package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerkoInternetApp {
	
	public static WebDriver driver;
	private String url = "https://the-internet.herokuapp.com/";
	
  @Test(enabled = false)
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
		driver.findElement(By.id("target")).sendKeys("A"+Keys.BACK_SPACE);
		driver.close();
		
  }
 
  @Test(enabled = false)
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
		
		
		
		
		
}
  @Test(enabled = false)
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
		
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
