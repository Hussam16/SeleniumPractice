package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

	WebDriver driver;

	public PageBase(WebDriver driver) {

		this.driver = driver;
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
		
	}
	
	public void sendText(By element,String text ) {
		
		driver.findElement(element).sendKeys(text);
	}
	
	public void clickElement(By element ) {
		
		driver.findElement(element).click();;
	}
	
	

}
