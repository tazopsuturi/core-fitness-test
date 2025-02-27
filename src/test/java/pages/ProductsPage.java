package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Form {
	//private final ILabel productTitle = getElementFactory().getLabel(By.xpath("//h3[@class='text-md font-semibold text-gray-900 dark:text-gray-100 min-h-8 max-h-8 overflow-hidden ']"), "product title");
	private final ILabel products = getElementFactory().getLabel(By.xpath("//div[@class='p-5 sm:ml-4 grid w-full sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-[min(4vw,4rem)]']"), "products");
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");
	
	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}
	
	public void clickAddProductButton() {
		addProduct.click();
	}
	
	public void selectProductsWithTestName() {
		List<ILabel> testProducts = getElementFactory().findElements(products.getLocator(), ILabel.class);
		
		for (IElement product : testProducts) {
			String productTitle = product.getText();
			if (productTitle != null && productTitle.contains("Test")){
				product.click();
			}
		}
	}
	
}
