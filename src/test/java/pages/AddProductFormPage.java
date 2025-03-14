package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigReader;
import constants.Constants;

public class AddProductFormPage extends Form {
	private final ILabel productTitleEn = getElementFactory().getLabel(By.id("name"), "Product title En");
	private final ILabel productTitleKa = getElementFactory().getLabel(By.id("name-georgian"), "Product title Ka");
	private final ILabel productDescriptionEn = getElementFactory().getLabel(By.cssSelector("[data-cy='description-input-field']"), "product description En");
	private final ILabel productDescriptionKa = getElementFactory().getLabel(By.cssSelector("[data-cy='description-georgian-input-field']"), "product description Ka");
	private final ILabel productPrice = getElementFactory().getLabel(By.id("price"), "price");
	private final ILabel productCategory = getElementFactory().getLabel(By.id("category"), "Category");
	private final ILabel chooseFile = getElementFactory().getLabel(By.id("file1"), "choose file1");
	private final ILabel chooseFile2 = getElementFactory().getLabel(By.id("file2"), "choose file2");
	private final IButton createProduct = getElementFactory().getButton(By.cssSelector("[data-cy='create-product-button']"), "create product button");
	
	public AddProductFormPage() {
		super(By.cssSelector("[data-cy='create-product-button']"), "Create product");
	}
	
	public void fillProductTitleEn() {
		productTitleEn.sendKeys(ConfigReader.config.product.enTitle);
	}
	
	public void fillProductTitleKa() {
		productTitleKa.sendKeys(ConfigReader.config.product.kaTitle);
	}
	
	public void fillDescriptionEn() {
		productDescriptionEn.sendKeys(ConfigReader.config.product.enDescription);
	}
	
	public void fillDescriptionKa() {
		productDescriptionKa.sendKeys(ConfigReader.config.product.kaDescription);
	}
	
	public void enterPrice() {
		productPrice.sendKeys(String.valueOf(ConfigReader.config.product.price));
	}
	
	public void chooseCategory() {
		productCategory.sendKeys(ConfigReader.config.product.category);
	}
	
	public void setChooseFile1() {
		chooseFile.sendKeys(Constants.FILE1_DIR);
	}
	
	public void setChooseFile2() {
		chooseFile2.sendKeys(Constants.FILE2_DIR);
	}
	
	public void clickCreateProduct() {
		createProduct.click();
	}
}
