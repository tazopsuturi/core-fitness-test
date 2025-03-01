package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

public class ProductsPage extends Form {
	private static final By PRODUCT_LOCATOR = By.xpath("//div[@class=\"flex flex-col items-center rounded-lg shadow-lg w-full sm:w-80 bg-white dark:bg-gray-800 overflow-hidden group duration-100 ease-in-out transition-transform transform hover:scale-105\"]");
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");
	
	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}
	
	public void clickAddProductButton() {
		addProduct.click();
	}
	
	public void selectProductsWithTestName() {
		AqualityServices.getConditionalWait().waitFor(
				() -> !getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class).isEmpty(),
				Duration.ofSeconds(10)
		);
		
		List<ILabel> products = getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class);
		AqualityServices.getLogger().info("Total products found: " + products.size());
		
		for (ILabel product : products) {
			ILabel viewButton = product.findChildElement(
					By.xpath("//a[@class='flex flex-col items-center w-full h-full relative cursor-pointer']"),
					ILabel.class
			);
			ILabel productTitle = product.findChildElement(
					By.xpath(".//h3[contains(@class, 'text-md')]"),
					ILabel.class
			);
			
			String titleText = productTitle.getText().toLowerCase();
			
			if (titleText.contains("test")) {
				AqualityServices.getConditionalWait().waitFor(() -> viewButton.state().isDisplayed() && viewButton.state().isClickable(), Duration.ofSeconds(10));
				viewButton.click();
				break;
			}
		}
	}
}
