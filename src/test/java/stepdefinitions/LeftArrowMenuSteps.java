package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LeftArrowMenu;

public class LeftArrowMenuSteps {
	LeftArrowMenu leftArrowMenu = new LeftArrowMenu();
	
	@When("I click menu arrow button")
	public void clickArrowButton() {
		leftArrowMenu.clickArrowButton();
	}
	
	@And("I click blog category")
	public void clickBlogCategory() {
		leftArrowMenu.clickBlogCategory();
	}
	
	@And("I click product category")
	public void clickProductsCategory() {
		leftArrowMenu.clickProductsCategory();
	}
	
	@And("I click profile button")
	public void clickProfileCategory() {
		leftArrowMenu.clickProfileCategory();
	}
}
