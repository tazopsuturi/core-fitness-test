package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BlogPage;

public class BlogPageSteps {
	BlogPage blogPage = new BlogPage();
	
	@Then("blog page is opened")
	public void blogPageIsOpened() {
		Assert.assertTrue(blogPage.state().waitForDisplayed(), "Blog page is not displayed");
	}
	
	@When("I press add blog button")
	public void pressAddBlogButton() {
		blogPage.clickAddBlog();
	}
	
	@Then("blog is created successfully")
	public void blogIsCreatedSuccessfully() {
		Assert.assertTrue(blogPage.isSuccessMessageDisplayed(), "Blog is not created successfully");
	}
	
	@When("I choose the first blog")
	public void chooseFirstBlog() {
		blogPage.chooseBlog();
	}
	
	@Then("blog is deleted successfully")
	public void blogIsDeletedSuccessfully() {
		Assert.assertTrue(blogPage.blogDeletedSuccessfully(), "Blog is not deleted successfully");
	}
}
