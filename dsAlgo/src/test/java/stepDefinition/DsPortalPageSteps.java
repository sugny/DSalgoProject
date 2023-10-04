package stepDefinition;

import com.dsAlgo.Pages.DsPortalPage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class DsPortalPageSteps {

	DsPortalPage dsPortalPage = new DsPortalPage();

	@Given("open the browser maximize and set the timeouts")
	public void open_the_browser_maximize_and_set_the_timeouts() throws Throwable {
		LoggerLoad.info("User opens the browser and maximizes the screen");
	}

	@And("load the url")
	public void load_the_url() throws Throwable {

		dsPortalPage.loadUrl();
		LoggerLoad.info("Url is loaded successfully");
	}

	@When("user click the {string} button")
	public void user_click_the_Get_Started_button(String getStarted) {
		dsPortalPage.clickGetStarted();
		LoggerLoad.info("User clicks get started button in ds portal page");
	}
}
