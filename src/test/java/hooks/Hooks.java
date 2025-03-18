package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Assert;
import pages.LoginHelper;
import utils.ConfigReader;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {
	
	@Before
	public void setUp() {
		getBrowser().maximize();
		getBrowser().goTo(SettingsTestData.getEnvData().getHost());
		
		boolean isSuccess = LoginHelper.login(
				ConfigReader.config.user.email,
				ConfigReader.config.user.password
		);
		
		if (!isSuccess) {
			Assert.fail("Login failed. Wrong email or password.");
		}
	}
	
	@After
	public void tearDown() {
		if (getBrowser().isStarted()) {
			getBrowser().quit();
		}
	}
}
