package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;


public class ProductsPage extends Form {
	private static final By PRODUCT_LOCATOR = By.xpath("//div[@class='flex flex-row justify-center w-full']");
	//private final ILabel products = getElementFactory().getLabel(By.xpath("//div[@class='p-5 sm:ml-4 grid w-full sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-[min(4vw,4rem)]']"), "products");
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");

	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}

	public void clickAddProductButton() {
		addProduct.click();
	}

	public void selectProductsWithTestName() {
		// Wait for products to load (adjust timeout as needed)
		AqualityServices.getConditionalWait().waitFor(
				() -> !getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class).isEmpty(),
				Duration.ofSeconds(10)
		);

		List<ILabel> products = getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class);

		for (ILabel product : products) {
			ILabel productTitle = product.findChildElement(
					By.xpath(".//h3[contains(@class, 'text-md')]"), // Relative XPath
					ILabel.class
			);

			if (productTitle.getText().contains("Test")) {
				IButton selectButton = product.findChildElement(
						By.xpath(".//button[contains(@data-cy, 'delete-product')]"), // Example
						IButton.class
				);
				selectButton.click();
				break;
			}
		}

//		List<ILabel> products = getElementFactory().findElements(PRODUCT_LOCATOR, ILabel.class);
//
//		for (ILabel product : products) {
//			// Target the specific title element inside the product (update locator)
//			ILabel productTitleLabel = product.findChildElement(
//					By.xpath("//h3[@class='text-md font-semibold text-gray-900 dark:text-gray-100 min-h-8 max-h-8 overflow-hidden ']"), // Example child selector
//					ILabel.class
//			);
//
//			String productTitle = productTitleLabel.getText();
//			if (productTitle != null && productTitle.contains("Test")) {
//				product.click(); // Or click the title directly: productTitleLabel.click()
//				break;
//			}
//		}
	}

}
