package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageSteps {
	LoginPage loginPage = new LoginPage();
	
	@Given("Login page is displayed")
	public void loginPageIsDisplayed() {
		Assert.assertTrue(loginPage.state().waitForDisplayed(), "Login page is not displayed");
	}
	
	@When("I click sign up button")
	public void clickSignUpButton() {
		loginPage.clickSignUpButton();
	}
}
