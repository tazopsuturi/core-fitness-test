package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteBlogPage;

public class DeleteBlogPageSteps {
	DeleteBlogPage deleteBlogPage = new DeleteBlogPage();
	
	@Then("blog settings page is opened")
	public void blogSettingsPageIsOpened() {
		deleteBlogPage.state().waitForDisplayed();
	}
	
	@When("I click delete blog button")
	public void clickDeleteBlogButton() {
		deleteBlogPage.clickDeleteButton();
	}
	
	@And("I click confirm delete button")
	public void clickConfirmDeleteButton() {
		deleteBlogPage.clickConfirmDeleteButton();
	}
	
}
