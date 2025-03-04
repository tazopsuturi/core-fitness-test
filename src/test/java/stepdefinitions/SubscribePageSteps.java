package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SubscribePage;

public class SubscribePageSteps {
	SubscribePage subscribePage = new SubscribePage();
	
	@Then("User goes to subscription page")
	public void goToSubscriptionPage() {
		Assert.assertTrue(subscribePage.state().waitForNotDisplayed(), "Profile page is still displayed");
	}
}
