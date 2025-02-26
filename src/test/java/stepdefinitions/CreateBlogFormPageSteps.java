package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateBlogFormPage;
import utils.ConfigReader;

import java.io.IOException;

public class CreateBlogFormPageSteps {
	CreateBlogFormPage createBlogFormPage = new CreateBlogFormPage();
	ConfigReader.Config config;
	
	public CreateBlogFormPageSteps() {
		try {
			ConfigReader.loadConfig();
			config = ConfigReader.config;
		} catch (IOException e) {
			throw new RuntimeException("Failed to load config.json", e);
		}
	}
	
	@Then("add blog form is displayed")
	public void addBlogFormIsDisplayed() {
		createBlogFormPage.state().waitForDisplayed();
	}
	
	@When("I enter blog title\\(en)")
	public void enterBlogTitleEn() {
		createBlogFormPage.fillEngTitleField(config.blog.enTitle);
	}
	
	@And("I enter blog title\\(ka)")
	public void enterBlogTitleKa() {
		createBlogFormPage.fillKaTitleField(config.blog.kaTitle);
	}
	
	@And("I enter blog description\\(en)")
	public void enterBlogDescriptionEn() {
		createBlogFormPage.fillEngDescriptionField(config.blog.enDescription);
	}
	
	@And("I enter blog description\\(ka)")
	public void enterBlogDescriptionKa() {
		createBlogFormPage.fillKaDescriptionField(config.blog.kaDescription);
	}
	
	@And("I choose blog category")
	public void chooseBlogCategory() {
		createBlogFormPage.fillCategoryField(config.blog.category);
	}
	
	@And("I click create blog button")
	public void clickCreateBlogButton() {
		createBlogFormPage.clickCreateBlogButton();
	}
}
