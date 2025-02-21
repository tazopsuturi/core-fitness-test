package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigReader;

public class BlogPage extends Form {
	private final IButton addBlog = getElementFactory().getButton(By.cssSelector("[data-cy='add-product-button']"), "Add Blog");
	private final ILabel successMessage = getElementFactory().getLabel(By.xpath("//section[@aria-label='Notifications alt+T']"), "Success Message");
	private final ILabel blogContainer = getElementFactory().getLabel(By.xpath("//div[@class='text-sm text-gray-600 dark:text-gray-300 mb-4']"), "Blog Container");
	
	public BlogPage() {
		super(By.xpath("//div[@class='shadow-lg shadow-slate-800/25 rounded-2xl m-2']"), "Blog Page");
	}
	
	public void clickAddBlog() {
		addBlog.click();
	}
	
	public boolean isSuccessMessageDisplayed() {
		return successMessage.state().waitForDisplayed();
	}
	
	public String chooseBlog() {
		String blogEmailText = blogContainer.toString();
		String emailOfBlog = blogEmailText.split(":")[0].trim();
		
		if (emailOfBlog.equals(ConfigReader.config.user.email)) {
			blogContainer.click();
		}
		return emailOfBlog;
	}
	
	public boolean blogDeletedSuccessfully() {
		return !chooseBlog().equals(ConfigReader.config.user.email);
	}
}
