package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	private By pageTitle = By.tagName("h6");

	public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public boolean pageTitleDisplayed() {

		return driver.findElement(pageTitle).isDisplayed();

	}

	public void navigateToPage(String pageName) {
		driver.findElement(By.linkText(pageName)).click();
	}

	public String getCurrentUrl() {

		return driver.getCurrentUrl();
	}

	public void navigateBack() {

		driver.navigate().back();

	}

	public void clickProfileIcon() {
		driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();

	}

	public String getPageTitle() {

		return driver.findElement(pageTitle).getText();

	}

}
