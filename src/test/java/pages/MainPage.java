package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
	//private final ILabel mainPage = getElementFactory().getLabel(By.xpath("//div[@class='border flex w-full flex-col border-gray-600 bg-gray-800 text-white p-2 m-2 rounded-md shadow-md'][1]"), "Main Page", ElementState.EXISTS_IN_ANY_STATE);
	private final ILabel arrowButton = getElementFactory().getLabel(By.xpath("//div[@class='fixed items-center sm:flex hidden   justify-center left-0 top-1/2 transform -translate-y-1/2 w-20 h-16 bg-transparent  cursor-pointer z-20  transform translate-x-0']"), "Arrow Button", ElementState.EXISTS_IN_ANY_STATE);
	private final ILabel blogCategory = getElementFactory().getLabel(By.xpath("//a[@href='/en-US/blogs']"), "Blog Category");
	
	public MainPage() {
		super(By.xpath("//div[@class='shadow-lg shadow-slate-800/25 rounded-2xl m-2']"), "Main Page");
	}
	
	public void clickArrowButton() {
		arrowButton.click();
	}
	
	public void clickBlogCategory() {
		blogCategory.click();
	}
}
