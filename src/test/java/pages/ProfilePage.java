package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.Constants;
import org.openqa.selenium.By;
import utils.SettingsTestData;

import java.time.Duration;

public class ProfilePage extends Form {
	private final ILabel changePassword = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'underline cursor-pointer')]"), "Change Password");
	private final ILabel profilePictureImg = getElementFactory().getLabel(By.xpath("//img[@class='rounded-2xl h-full object-cover']"), "Profile Picture", ElementState.EXISTS_IN_ANY_STATE);
	private final ILabel inputProfileImg = getElementFactory().getLabel(By.xpath("//input[@style='display: none;']"), "Input Profile Picture", ElementState.EXISTS_IN_ANY_STATE);
	private final IButton subscribe = getElementFactory().getButton(By.xpath("//button[contains(@class, 'rounded-2xl') and contains(@class, 'bg-white')]"), "Subscribe");
	
	public ProfilePage() {
		super(By.xpath("//button[contains(@class, 'bg-red-500')]"), "Delete Profile");
	}
	
	public void clickChangePassword() {
		changePassword.click();
	}
	
	public void clickSubscribe() {
		subscribe.click();
	}
	
	public void clickSetProfilePicture() {
		inputProfileImg.sendKeys(Constants.PROFILE_PICTURE);
		AqualityServices.getConditionalWait().waitFor(() -> profilePictureImg.state().isClickable(), Duration.ofSeconds(SettingsTestData.getEnvData().getWait()));
	}
}
