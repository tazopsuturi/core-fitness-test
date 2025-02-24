package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ProductsPage extends Form {
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");
	
	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}
}
