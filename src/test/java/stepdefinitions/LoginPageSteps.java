package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginPageSteps {
	LoginPage loginPage = new LoginPage();
	
	public LoginPageSteps() {
		try {
			ConfigReader.loadConfig();
		} catch (Exception e) {
			throw new RuntimeException("Failed to load config", e);
		}
	}
	
	@Given("Login page is displayed")
	public void loginPageIsDisplayed() {
		Assert.assertTrue(loginPage.state().waitForDisplayed(), "Login page is not displayed");
	}
	
	@When("I click sign up button")
	public void clickSignUpButton() {
		loginPage.clickSignUpButton();
	}
	
	@When("I fill email field")
	public void fillEmailField() {
		loginPage.fillEmailField(ConfigReader.config.user.email);
	}
	
	@And("I fill password field")
	public void fillPasswordField() {
		loginPage.fillPasswordField(ConfigReader.config.user.password);
	}
	
	
	@When("I click login button")
	public void clickLoginButton() {
		loginPage.clickLoginButton();
	}
}
