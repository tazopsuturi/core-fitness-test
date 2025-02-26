package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AddProductFormPage;

public class AddProductFormPageSteps {
	AddProductFormPage addProductFormPage = new AddProductFormPage();
	
	@And("I enter product title\\(en)")
	public void enterProductTitleEn() {
		addProductFormPage.fillProductTitleEn();
	}
	
	@And("I enter product title\\(ka)")
	public void enterProductTitleKa() {
		addProductFormPage.fillProductTitleKa();
	}
	
	@And("I enter product description\\(en)")
	public void enterProductDescriptionEn() {
		addProductFormPage.fillDescriptionEn();
	}
	
	@And("I enter product description\\(ka)")
	public void enterProductDescriptionKa() {
		addProductFormPage.fillDescriptionKa();
	}
	
	@And("I enter product price")
	public void enterProductPrice() {
		addProductFormPage.enterPrice();
	}
	
	@And("I choose product category")
	public void chooseProductCategory() {
		addProductFormPage.chooseCategory();
	}
	
	@And("I choose file1")
	public void chooseFile1() {
		addProductFormPage.setChooseFile1();
	}
	
	@And("I choose file2")
	public void chooseFile2() {
		addProductFormPage.setChooseFile2();
	}
	
	@And("I press create product button")
	public void pressCreateProductButton() {
		addProductFormPage.clickCreateProduct();
	}
	
	@Then("Product is created")
	public void isProductCreated() {
		Assert.assertTrue(addProductFormPage.state().waitForNotDisplayed(), "Product is not created");
	}
}
