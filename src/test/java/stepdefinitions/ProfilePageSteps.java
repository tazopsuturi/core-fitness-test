package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProfilePage;
import utils.ConfigReader;

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
	
	@When("User fills display name")
	public void fillDisplayName() {
		profilePage.setDisplayName();
	}
	
	@And("User clicks update button")
	public void clickUpdateButton() {
		profilePage.clickUpdateDisplayName();
	}
	
	@Then("Display name is updated")
	public void checkDisplayName() {
		String profileName = profilePage.setDisplayName();
		
		Assert.assertTrue(ConfigReader.config.user.email.contains(profileName), "Display name is not updated");
	}
}
