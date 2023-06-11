package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AddUserPage;
import PageObjects.DashboardPage;
import PageObjects.UserManagmentPage;

public class OrangeHRMTestCases extends BaseDebug {
	@Test
	public void navigationTestcases() throws Exception {

		DashboardPage dashboard = homepage.LoginOrange("Admin", "admin123");
		Assert.assertTrue(dashboard.pageTitleDisplayed());
		Assert.assertTrue(dashboard.getPageTitle().equalsIgnoreCase("Dashboard"));
		dashboard.navigateToPage("Admin");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("viewSystemUsers"));
		dashboard.navigateToPage("PIM");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("viewEmployeeList"));
		dashboard.navigateToPage("Leave");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("viewLeaveList"));
		dashboard.navigateToPage("Time");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("viewEmployeeTimesheet"));
		dashboard.navigateToPage("Recruitment");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("viewCandidates"));
		dashboard.clickProfileIcon();
		dashboard.navigateToPage("Logout");
		Assert.assertTrue(dashboard.getCurrentUrl().contains("login"));

	}

	@Test
	public void createNewUserAccount() throws InterruptedException {
		// Login To the Application
		DashboardPage dashboard = homepage.LoginOrange("Admin", "admin123");
		// Navigate to admin page
		UserManagmentPage userMangPage = dashboard.navigateToPage("Admin");
		// Click Add new user button
		AddUserPage addUserPage = userMangPage.clickAddNewUserButton();
		
		// Add user detials
		addUserPage.addEmployeeName("Hussam Abd El Fattah");
		addUserPage.addUserName("Hussam1693");
		addUserPage.addPassword("Asd123@@");
		addUserPage.addPasswordConfirm("Asd123@@");
		addUserPage.userRoleDropDown("Admin");
		addUserPage.statusDropDown("Disabled");
		addUserPage.clickSubmit();

	
		
		
		
		
		

	}

}
