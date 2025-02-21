package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
	private final ILabel mainPage = getElementFactory().getLabel(By.xpath("//div[@class='border flex w-full flex-col border-gray-600 bg-gray-800 text-white p-2 m-2 rounded-md shadow-md'][1]"), "Main Page");
	
	public MainPage() {
		super(By.xpath("//div[@class='border flex w-full flex-col border-gray-600 bg-gray-800 text-white p-2 m-2 rounded-md shadow-md'][1]"), "Main Page");
	}
}
