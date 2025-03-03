package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCartPage;

public class ShoppingCartPageSteps {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	@Then("Shopping cart page is displayed")
	public void isShoppingCartPageDisplayed() {
		shoppingCartPage.state().waitForDisplayed();
	}
	
	@When("I press clear cart button")
	public void clickClearCart() {
		shoppingCartPage.clickClearCart();
	}
	
	@Then("Cart is cleared")
	public void isCartCleared() {
		shoppingCartPage.isCartEmptyMessage();
	}
}
