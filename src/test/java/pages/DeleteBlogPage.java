package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DeleteBlogPage extends Form {
	private final IButton deleteButton = getElementFactory().getButton(By.cssSelector("[data-cy='delete-button']"), "Delete Button");
	private final IButton confirmDeleteButton = getElementFactory()
			.getButton(By.xpath("//button[@class='px-4 py-2 bg-red-500 text-white rounded hover:bg-red-600']"), "Confirm Delete Button");
	
	public DeleteBlogPage() {
		super(By.cssSelector("[data-cy='delete-button']"), "Delete Blog Page");
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
	}
	
	public void clickConfirmDeleteButton() {
		confirmDeleteButton.click();
	}
}
