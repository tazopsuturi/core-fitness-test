package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DeleteProductPage extends Form {
	private final IButton deleteProduct = getElementFactory().getButton(By.cssSelector("data-cy[='delete-button']"), "delete product");
	private final IButton confirmDeleteProduct = getElementFactory().getButton(By.cssSelector("data-cy[='confirm-delete-button']"), "confirm delete");
	
	public DeleteProductPage() {
		super(By.cssSelector("data-cy[='delete-button']"), "delete button");
	}
	
	public void clickDeleteProductButton() {
		deleteProduct.click();
	}
	
	public void clickConfirmDeleteProductButton() {
		confirmDeleteProduct.state().waitForDisplayed();
		confirmDeleteProduct.click();
	}
	
}
