package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.RightArrowMenu;

public class RightArrowMenuSteps {
	RightArrowMenu rightArrowMenu = new RightArrowMenu();
	
	@When("I click right arrow button")
	public void clickRightArrowButton() {
		rightArrowMenu.clickRightArrow();
	}
	
	@And("I click view cart button")
	public void clickViewCartButton() {
		rightArrowMenu.clickViewCart();
	}
}
