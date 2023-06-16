package mobileTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBaseTest {
	AndroidDriver driver;
	AppiumDriverLocalService appiumLocalService;

	@Test
	public void setAppium() throws MalformedURLException {

		AppiumDriverLocalService appiumLocalService = new AppiumServiceBuilder().usingAnyFreePort().build(); // Creat //
																												// instance
		appiumLocalService.start(); // Starts local Appium server instance
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Demo1");
		// options.setApp(System.getProperty("user.dir")+"\\APK_Files\\ApiDemos-debug.apk");
		options.setApp(System.getProperty("user.dir") + "\\APK_Files\\General-Store.apk");
		// driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		driver = new AndroidDriver(appiumLocalService, options);
		driver.quit();

	}

	@Test
	public void setAppiuMethod2() throws MalformedURLException, Exception {

		appiumLocalService = new AppiumServiceBuilder().usingAnyFreePort().build(); // Creates local Appium server //
																					// instance
		appiumLocalService.start(); // Starts local Appium server instance
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Demo1");
		options.setApp(System.getProperty("user.dir") + "\\APK_Files\\General-Store.apk");
		driver = new AndroidDriver(appiumLocalService, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement countryList = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		countryList.click();
		WebElement chooseCountry = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
		chooseCountry.click();
		WebElement nameBox= driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
		nameBox.sendKeys("Hussam");
		driver.hideKeyboard();
		WebElement femaleRadioButton=driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		femaleRadioButton.click();
		WebElement loginButton= driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		loginButton.click();
		Thread.sleep(1000);

		driver.quit();
		appiumLocalService.stop();

	}
}
