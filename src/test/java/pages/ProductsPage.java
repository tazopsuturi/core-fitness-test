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
	private static final By PRODUCT_LOCATOR = By.xpath("//div[contains(@class, 'flex flex-col items-center')]");
	//private final ILabel products = getElementFactory().getLabel(By.xpath("//div[@class='p-5 sm:ml-4 grid w-full sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-[min(4vw,4rem)]']"), "products");
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");
	
	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}
	
	public void clickAddProductButton() {
		addProduct.click();
	}
	
	public void selectProductsWithTestName() {
		List<ILabel> products = getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class);
		
		for (ILabel product : products) {
			String productTitle = product.getText();
			if (productTitle != null && productTitle.contains("Test")){
				product.click();
				break;
			}
		}
	}
	
}
