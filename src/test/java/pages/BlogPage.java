package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class BlogPage extends Form {
	private final IButton addBlog = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Blog");
	private final ILabel successMessage = getElementFactory().getLabel(By.xpath("//section[@aria-label='Notifications alt+T']"), "Success Message");
	
	public BlogPage() {
		super(By.xpath("//div[@class='shadow-lg shadow-slate-800/25 rounded-2xl m-2']"), "Blog Page");
	}
	
	public void clickAddBlog() {
		addBlog.click();
	}
	
	public boolean isSuccessMessageDisplayed() {
		return successMessage.state().waitForDisplayed();
	}
}
