package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DeleteProductPage extends Form {
	private final IButton deleteProduct = getElementFactory().getButton(By.xpath("//button[@data-cy='delete-button']"), "delete product");
	private final IButton confirmDeleteProduct = getElementFactory().getButton(By.xpath("//button[@data-cy='confirm-delete-button']"), "confirm delete");
	
	public DeleteProductPage() {
		super(By.xpath("//button[@data-cy='add-to-cart-button-Test Blog EN']"), "delete button");
	}
	
	public boolean isDeleteButtonDisplayed() {
		return deleteProduct.state().waitForDisplayed();
	}
	
	public void clickDeleteProductButton() {
		deleteProduct.state().waitForDisplayed();
		deleteProduct.click();
	}
	
	public void clickConfirmDeleteProductButton() {
		confirmDeleteProduct.state().waitForDisplayed();
		confirmDeleteProduct.click();
	}
}
