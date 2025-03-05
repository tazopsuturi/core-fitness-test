package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProfilePage;

public class ProfilePageSteps {
	ProfilePage profilePage = new ProfilePage();
	
	@When("User clicks change password field")
	public void clickChangePasswordField() {
		profilePage.clickChangePassword();
	}
	
	@Then("User goes to Profile page")
	public void goToProfilePage() {
		Assert.assertTrue(profilePage.state().waitForDisplayed(), "Profile page is not displayed");
	}
	
	@When("I click subscribe button")
	public void clickSubscribeButton() {
		profilePage.clickSubscribe();
	}
	
	@When("User clicks profile picture field")
	public void clickProfilePictureField() {
		profilePage.clickSetProfilePicture();
	}
	
}
