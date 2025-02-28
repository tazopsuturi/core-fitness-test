package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.DeleteProductPage;

public class DeleteProductPageSteps {
	DeleteProductPage deleteProductPage = new DeleteProductPage();
	
	@And("I click delete product button")
	public void clickDeleteButton() {
		deleteProductPage.clickDeleteProductButton();
	}
	
	@And("I click confirm delete product button")
	public void clickConfirmDeleteButton() {
		deleteProductPage.clickConfirmDeleteProductButton();
	}
	
}
