package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashboardPage;

public class OrangeHRMTestCases extends BaseDebug {
	@Test
	public void navigationTestcases() throws Exception {
		
		DashboardPage dashboard=homepage.LoginOrange("Admin", "admin123");
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
}
