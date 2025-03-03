package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LeftArrowMenu extends Form {
	private final ILabel arrowButton = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'fixed items-center') and contains(@class, 'w-20 h-16 bg-transparent ')]"), "Arrow Button", ElementState.EXISTS_IN_ANY_STATE);
	private final ILabel blogCategory = getElementFactory().getLabel(By.xpath("//a[@href='/en-US/blogs']"), "Blog Category");
	private final ILabel productsCategory = getElementFactory().getLabel(By.xpath("//a[@href='/en-US/products']"), "Products Category");
	
	public LeftArrowMenu() {
		super(By.xpath("//a[@href='/en-US/blogs']"), "Blog Category");
	}
	
	public void clickArrowButton() {
		arrowButton.click();
	}
	
	public void clickBlogCategory() {
		blogCategory.click();
	}
	
	public void clickProductsCategory() {
		productsCategory.click();
	}
}
