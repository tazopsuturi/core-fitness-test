package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
	private final ILabel arrowButton = getElementFactory().getLabel(By.xpath("//div[@class='fixed items-center sm:flex hidden   justify-center left-0 top-1/2 transform -translate-y-1/2 w-20 h-16 bg-transparent  cursor-pointer z-20  transform translate-x-0']"), "Arrow Button", ElementState.EXISTS_IN_ANY_STATE);
	private final ILabel blogCategory = getElementFactory().getLabel(By.xpath("//a[@href='/en-US/blogs']"), "Blog Category");
	private final ILabel productsCategory = getElementFactory().getLabel(By.xpath("//a[@href='/en-US/products']"), "Products Category");
	
	public MainPage() {
		super(By.xpath("//div[@class='shadow-lg shadow-slate-800/25 rounded-2xl m-2']"), "Main Page");
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
