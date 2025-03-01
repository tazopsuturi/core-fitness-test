package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DeleteProductPage;

public class DeleteProductPageSteps {
	DeleteProductPage deleteProductPage = new DeleteProductPage();
	
	@Then("Delete Product page is displayed")
	public void isDeleteProductPageDisplayed() {
		Assert.assertTrue(deleteProductPage.state().waitForDisplayed(), "Delete Product page is not displayed");
	}
	
	@And("I click delete product button")
	public void clickDeleteButton() throws InterruptedException {
		deleteProductPage.clickDeleteProductButton();
	}
	
	@And("I click confirm delete product button")
	public void clickConfirmDeleteButton() {
		deleteProductPage.clickConfirmDeleteProductButton();
	}
}
