package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
	MainPage mainPage = new MainPage();
	
	@Then("Main page is displayed")
	public void mainPageIsDisplayed() {
		Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not displayed");
	}
	
}
