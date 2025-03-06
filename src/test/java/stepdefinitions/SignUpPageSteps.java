package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SignUpPage;
import utils.ConfigReader;

public class SignUpPageSteps {
	SignUpPage signUpPage = new SignUpPage();
	
	public SignUpPageSteps() {
		try {
			ConfigReader.loadConfig();
		} catch (Exception e) {
			throw new RuntimeException("Failed to load config", e);
		}
	}
	
	@Then("SignUp form is displayed")
	public void signUpPageIsDisplayed() {
		Assert.assertTrue(signUpPage.state().waitForDisplayed(), "Sign up form is not displayed");
	}
	
	@And("I confirm my password")
	public void enterConfirmPassword() {
		signUpPage.enterUserConfirmPassword(ConfigReader.config.user.password);
	}
	
	@And("I click register button")
	public void clickRegisterButton() {
		signUpPage.clickSignInButton();
	}
	
	@Then("User is registered successfully")
	public void userRegisteredSuccessfully() {
		if(signUpPage.isPasswordsDoNotMatchMsgDisplayed()) {
			Assert.fail("Passwords do not match. Try again!");
		}
	}
}
