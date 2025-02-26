package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;

public class ProductsPageSteps {
	ProductsPage productsPage = new ProductsPage();
	
	@Then("products page is displayed")
	public void productsPageIsDisplayed() {
		productsPage.state().waitForDisplayed();
	}
	
	@When("I click add product button")
	public void clickAddProduct(){
		productsPage.clickAddProductButton();
	}

}
