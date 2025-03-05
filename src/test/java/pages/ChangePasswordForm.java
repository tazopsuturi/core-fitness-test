package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigReader;

public class ChangePasswordForm extends Form {
	private final String newPasswordText = "Pass12345";
	private final ILabel currentPassword = getElementFactory().getLabel(By.xpath("//input[@class='border rounded p-2 bg-white w-[250px]']"), "Current Password");
	private final ILabel newPassword = getElementFactory().getLabel(By.xpath("//input[@placeholder='New Password']"), "New Password");
	private final ILabel confirmPassword = getElementFactory().getLabel(By.xpath("//input[@placeholder='Confirm Password']"), "Confirm Password", ElementState.EXISTS_IN_ANY_STATE);
	private final IButton changePassword = getElementFactory().getButton(By.xpath("//button[contains(@class, 'font-medium')]"), "Change Password");
	
	public ChangePasswordForm() {
		super(By.xpath("//button[contains(@class, 'font-medium')]"), "Change Password");
	}
	
	public void enterCurrentPassword() {
		currentPassword.state().waitForDisplayed();
		currentPassword.sendKeys(ConfigReader.config.user.password);
	}
	
	public void enterNewPassword() {
		newPassword.state().waitForClickable();
		newPassword.sendKeys(newPasswordText);
	}
	
	public void enterConfirmPassword() {
		confirmPassword.state().waitForClickable();
		confirmPassword.sendKeys(newPasswordText);
	}
	
	public void clickChangePassword() {
		changePassword.click();
	}
	
}
