package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SignUpPage;

public class SignUpPageSteps {
	SignUpPage signUpPage = new SignUpPage();
	
	@Then("SignUp form is displayed")
	public void signUpPageIsDisplayed() {
		Assert.assertTrue(signUpPage.state().waitForDisplayed(), "Sign up form is not displayed");
	}
	
	@When("I enter my {string}")
	public void enterEmail(String email) {
		signUpPage.enterUserEmail(email);
	}
	
	@And("I fill my {string}")
	public void enterPassword(String password) {
		signUpPage.enterUserPassword(password);
	}
	
	@And("I confirm my {string}")
	public void enterConfirmPassword(String password) {
		signUpPage.enterUserConfirmPassword(password);
	}
	
	@And("I click register button")
	public void clickRegisterButton() {
		signUpPage.clickSignInButton();
	}
}
