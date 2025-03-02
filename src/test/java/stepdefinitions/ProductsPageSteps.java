package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;

public class ProductsPageSteps {
	ProductsPage productsPage = new ProductsPage();
	
	@When("User goes to Product page")
	public void isProductPageDisplayed() {
		Assert.assertTrue(productsPage.state().waitForDisplayed(), "Product page is not displayed");
	}
	
	@When("I click add product button")
	public void clickAddProduct(){
		productsPage.clickAddProductButton();
	}
	
	@When("I choose product")
	public void chooseProductToDelete() {
		productsPage.selectProductsToDelete();
	}
	
	@When("I click add to cart button")
	public void clickAddToCart() {
		productsPage.clickAddToCart();
	}
	
//	@Then("Product is added to cart")
//	public void isProductAddedToCart() {
//		Assert.assertTrue(productsPage.isProductAddedToCart(), "Product is not added to cart");
//	}
	
//	@When("I click right arrow button")
//	public void clickRightArrowButton() {
//		productsPage.clickRightArrowButton();
//	}
}
