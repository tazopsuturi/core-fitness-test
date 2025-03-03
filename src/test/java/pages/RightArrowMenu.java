package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class RightArrowMenu extends Form {
	private final IButton viewCart = getElementFactory().getButton(By.xpath("//button[contains(@class, 'gap-2 px-4 py-2') and contains(@class, 'bg-primary')]"), "View Cart Button");
	private final ILabel rightArrow = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'fixed right-0') and contains(@class, 'w-20 h-16 bg-transparent ')]"), "Right Arrow Button");
	
	public RightArrowMenu() {
		super(By.xpath("//button[contains(@class, 'gap-2 px-4 py-2') and contains(@class, 'bg-primary')]"), "View Cart Button");
	}
	
	public void clickRightArrow() {
		rightArrow.click();
	}
	
	public void clickViewCart() {
		viewCart.click();
	}
}
