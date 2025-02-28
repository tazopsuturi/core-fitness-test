package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;


public class ProductsPage extends Form {
	private static final By PRODUCT_LOCATOR = By.xpath("//div[@class='flex flex-row justify-center w-full']");
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
			ILabel productTitle = product.findChildElement(
					By.xpath(".//h3[contains(@class, 'text-md')]"),
					ILabel.class
			);
			
			String titleText = productTitle.getText();
			AqualityServices.getLogger().info("Checking product: " + titleText);
			
			if (titleText.contains("Test")) {
				IButton viewButton = product.findChildElement(
						By.xpath(".//a[contains(@class, 'bg-blue-600')]"),
						IButton.class
				);
				
				AqualityServices.getConditionalWait().waitFor(() -> viewButton.state().isClickable());
				viewButton.click();
				break;
			}
		}
	}

}
