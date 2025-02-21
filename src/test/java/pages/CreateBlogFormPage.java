package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigReader;

import java.io.IOException;

public class CreateBlogFormPage extends Form {
	public static ConfigReader.Config config;
	private final ILabel engTitleField = getElementFactory().getLabel(By.id("title"), "En Title Field");
	private final ILabel kaTitleField = getElementFactory().getLabel(By.id("title_ka"), "Ka Title Field");
	private final ILabel engDescriptionField = getElementFactory().getLabel(By.id("description"), "En Description Field");
	private final ILabel kaDescriptionField = getElementFactory().getLabel(By.id("description_ka"), "Ka Description Field");
	private final ILabel categoryField = getElementFactory().getLabel(By.id("category"), "Category Field");
	private final IButton createBlog = getElementFactory().getButton(By.cssSelector("[data-cy='create-product-button']"), "Create Blog");
	
	
	public CreateBlogFormPage() {
		super(By.cssSelector("[data-cy='create-product-button']"), "Create Blog Page");
	}
	
	public void fillEngTitleField(String enTitle) {
		engTitleField.sendKeys(enTitle);
	}
	
	public void fillKaTitleField(String kaTitle) {
		kaTitleField.sendKeys(kaTitle);
	}
	
	public void fillEngDescriptionField(String enDescription) {
		engDescriptionField.sendKeys(enDescription);
	}
	
	public void fillKaDescriptionField(String kaDescription) {
		kaDescriptionField.sendKeys(kaDescription);
	}
	
	public void fillCategoryField(String category) {
		categoryField.sendKeys(category);
	}
	
	public void clickCreateBlogButton() {
		createBlog.click();
	}
	
}
