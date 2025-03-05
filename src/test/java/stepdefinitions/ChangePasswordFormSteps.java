package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ChangePasswordForm;

public class ChangePasswordFormSteps {
	ChangePasswordForm changePasswordForm = new ChangePasswordForm();
	
	@And("User enters current password")
	public void enterCurrentPassword() {
		changePasswordForm.enterCurrentPassword();
	}
	
	@And("User enters new password")
	public void enterNewPassword() {
		changePasswordForm.enterNewPassword();
	}
	
	@And("User enters confirm password")
	public void enterConfirmPassword() {
		changePasswordForm.enterConfirmPassword();
	}
	
	@And("User clicks change password button")
	public void clickChangePasswordButton() {
		changePasswordForm.clickChangePassword();
	}
}
