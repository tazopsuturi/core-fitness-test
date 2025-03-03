package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ShoppingCartPage;

public class ShoppingCartPageSteps {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	@Then("Shopping cart page is displayed")
	public void isShoppingCartPageDisplayed() {
		shoppingCartPage.state().waitForDisplayed();
	}
}
