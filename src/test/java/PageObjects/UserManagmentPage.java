package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManagmentPage {
	WebDriver driver;

	public UserManagmentPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public AddUserPage clickAddNewUserButton() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		return new AddUserPage(driver);
		
	}

}
