package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddUserPage extends PageBase {

	private By employeeName = By.cssSelector("input[placeholder='Type for hints...']");
	private By userName = By.xpath("(//input)[3]");
	private By password = By.xpath("(//input[@type='password'])[1]");
	private By confirmPassword = By.xpath("(//input[@type='password'])[2]");
	private By roleList = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
	private By statusList = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
	private By submitButton = By.cssSelector("button[type='submit']");

	WebDriver driver;

	public AddUserPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void addEmployeeName(String name) {
		sendText(employeeName, name);
	}

	public void addUserName(String username) {
		sendText(userName, username);
	}

	public void addPassword(String pwd) {
		sendText(password, pwd);
	}

	public void addPasswordConfirm(String pwd) {
		sendText(confirmPassword, pwd);
	}

	public void userRoleDropDown(String roleName) {

		if (roleName.equalsIgnoreCase("Admin")) {
			WebElement dropdown = driver.findElement(roleList);
			Actions actions = new Actions(driver);
			actions.click(dropdown);
			// Press the down arrow key
			actions.sendKeys(Keys.ARROW_DOWN);

			// Press the enter key
			actions.sendKeys(Keys.ENTER);
			// Perform the actions
			actions.build().perform();

		} else if (roleName.equalsIgnoreCase("Ess")) {
			WebElement dropdown = driver.findElement(roleList);
			Actions actions = new Actions(driver);
			actions.click(dropdown);
			// Press the down arrow key
			actions.sendKeys(Keys.ARROW_DOWN);
			actions.sendKeys(Keys.ARROW_DOWN);
			// Press the enter key
			actions.sendKeys(Keys.ENTER);
			// Perform the actions
			actions.build().perform();
		}

	}
	public void statusDropDown(String status) {

		if (status.equalsIgnoreCase("Enabled")) {
			WebElement dropdown = driver.findElement(statusList);
			Actions actions = new Actions(driver);
			actions.click(dropdown);
			// Press the down arrow key
			actions.sendKeys(Keys.ARROW_DOWN);

			// Press the enter key
			actions.sendKeys(Keys.ENTER);
			// Perform the actions
			actions.build().perform();

		} else if (status.equalsIgnoreCase("Disabled")) {
			WebElement dropdown = driver.findElement(statusList);
			Actions actions = new Actions(driver);
			actions.click(dropdown);
			// Press the down arrow key
			actions.sendKeys(Keys.ARROW_DOWN);
			actions.sendKeys(Keys.ARROW_DOWN);
			// Press the enter key
			actions.sendKeys(Keys.ENTER);
			// Perform the actions
			actions.build().perform();
		}

	}

	public void clickSubmit() {
		clickElement(submitButton);
	}
	
}
