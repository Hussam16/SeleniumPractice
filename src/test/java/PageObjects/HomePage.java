package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	

	private By userNameBox = By.cssSelector("input[name='username']");
	private By passwrodBox = By.cssSelector("input[name='password']");
	private By loginButton = By.cssSelector("button[type='submit']");
	private By profileIcon=By.cssSelector("span[class='oxd-userdropdown-tab']");

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public DashboardPage LoginOrange(String email, String password)  {

		driver.findElement(userNameBox).sendKeys(email);
		driver.findElement(passwrodBox).sendKeys(password);
		driver.findElement(loginButton).click();
		return  new DashboardPage(driver);
	}

}
