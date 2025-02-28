package stepdefinitions;

import io.cucumber.java.en.Given;
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
		productsPage.selectProductsWithTestName();
	}

}
