package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LoginPage;
import utils.ConfigReader;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {
	
	@Before
	public void setUp() {
		getBrowser().maximize();
		getBrowser().goTo(SettingsTestData.getEnvData().getHost());
		
		LoginPage loginPage = new LoginPage();
		
		if (loginPage.state().waitForDisplayed()) {
			loginPage.fillEmailField(ConfigReader.config.user.email);
			loginPage.fillPasswordField(ConfigReader.config.user.password);
			loginPage.clickLoginButton();
		}
		
	}
	
	@After
	public void tearDown() {
		if (getBrowser().isStarted()) {
			getBrowser().quit();
		}
	}
}
