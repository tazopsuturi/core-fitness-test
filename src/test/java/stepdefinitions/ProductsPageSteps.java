package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ProductsPage;

public class ProductsPageSteps {
	ProductsPage productsPage = new ProductsPage();
	
	@Then("products page is displayed")
	public void productsPageIsDisplayed() {
		productsPage.state().waitForDisplayed();
	}
}
