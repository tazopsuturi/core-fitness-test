package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
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
	
	@Then("Product is created")
	public void isProductCreated() {
		Assert.assertTrue(productsPage.state().waitForDisplayed(), "Product is not created");
	}
}
