package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Form {
	private final ILabel emptyCartMsg = getElementFactory().getLabel(By.xpath("//div[@class='text-center text-gray-500 py-8']"), "Empty Cart Message");
	private final IButton clearCart = getElementFactory().getButton
			(By.xpath("//button[contains(@class, 'inline-flex') and contains(@class, 'rounded-md') and contains(@class, 'hover:bg-red-50')]"), "Clear Cart Button");
	
	public ShoppingCartPage() {
		super(By.xpath("//h2[@class='tracking-tight text-2xl font-bold']"), "Shopping Cart Page");
	}
	
	public void isCartEmptyMessage() {
		emptyCartMsg.state().isDisplayed();
	}
	
	public void clickClearCart() {
		clearCart.click();
	}
}
