package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ProfilePage extends Form {
	private final ILabel changePassword = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'underline cursor-pointer')]"), "Change Password");
	private final IButton deleteProfile = getElementFactory().getButton(By.xpath("//button[contains(@class, 'bg-red-500')]"), "Delete Profile");
	private final IButton subscribe = getElementFactory().getButton(By.xpath("//button[contains(@class, 'rounded-2xl') and contains(@class, 'bg-white')]"), "Subscribe");
	
	public ProfilePage() {
		super(By.xpath("//button[contains(@class, 'bg-red-500')]"), "Delete Profile");
	}
	
	public void clickSubscribe() {
		subscribe.click();
	}
}
