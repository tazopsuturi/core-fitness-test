package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigReader;
import utils.SettingsTestData;

import java.time.Duration;
import java.util.List;

public class ProductsPage extends Form {
	private static final By product = By.xpath("//div[@class='flex flex-col items-center rounded-lg shadow-lg w-full sm:w-80 bg-white dark:bg-gray-800 overflow-hidden group duration-100 ease-in-out transition-transform transform hover:scale-105']");
	private final IButton addProduct = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Product Button");
	private final ILabel productAddedAlert = getElementFactory().getLabel(By.xpath("//section[@aria-label='Notifications alt+T' and @aria-live='polite']"), "Product Added Alert");
	
	public ProductsPage() {
		super(By.cssSelector("[data-cy='add-product-button']"), "Products Page");
	}
	
	public boolean isProductAdded() {
		return productAddedAlert.state().waitForDisplayed();
	}
	
	public void clickAddProductButton() {
		addProduct.click();
	}
	
	public void waitForProducts() {
		AqualityServices.getConditionalWait().waitFor(
				() -> !getElementFactory().findElements(product, ILabel.class).isEmpty(),
				Duration.ofSeconds(SettingsTestData.getEnvData().getWait())
		);
	}
	
	public void selectProductsToDelete() {
		waitForProducts();
		
		List<ILabel> products = getElementFactory().findElements(product, ILabel.class);
		
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
			
			if (titleText.contains(ConfigReader.config.product.enTitle)) {
				AqualityServices.getConditionalWait().waitFor(() -> viewButton.state().isDisplayed() && viewButton.state().isClickable(), Duration.ofSeconds(10));
				viewButton.click();
				break;
			}
		}
	}
	
	public void clickAddToCart() {
		waitForProducts();
		
		List<ILabel> products = getElementFactory().findElements(product, ILabel.class);
		
		int count = 0;
		for (ILabel product : products) {
			
			IButton addProductToCart = product.findChildElement
					(By.xpath("//button[contains(@class, 'w-full') and contains(@class, 'py-2 bg')]"), IButton.class);
			
			AqualityServices.getConditionalWait().waitFor(()
					-> addProductToCart.state().isDisplayed()
					&& addProductToCart.state().isClickable(), Duration.ofSeconds(SettingsTestData.getEnvData().getWait()));
			
			if (count < 3) {
				count++;
				addProductToCart.click();
			}else {
				break;
			}
		}
	}
}
