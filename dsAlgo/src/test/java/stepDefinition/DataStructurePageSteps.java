package stepDefinition;

import io.cucumber.java.en.*;

import com.dsAlgo.utils.LoggerLoad;

import com.dsAlgo.Pages.*;

public class DataStructurePageSteps {

	DataStructuresPage dspage = new DataStructuresPage();

	// @DS_02
	@When("The user clicks the Getting Started button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel() {
		dspage.getStarted_DS();
	}

	// @DS_03
	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		dspage.clickOnTimeComplexitylink();
	}

	@Given("The user is on the home page")
	public void the_user_is_on_home_page() {
		LoggerLoad.info("User is on Home page");

	}

	@When("user check all the required links available for data structures page")
	public void user_check_all_the_required_links_available_for_data_structures_page() {
		dspage.checkLinks();
		LoggerLoad.info("User checks all links available on Data Structures Page");
	}

	@Given("user is on Time Complexity Page")
	public void user_is_on_time_complexity_page() {
		LoggerLoad.info("User is on Time Complexity Page");
	}

	@Given("user is traversing to Time Complexity Page")
	public void user_is_traversing_to_time_complexity_page() {
		dspage.back();
		dspage.clickOnTimeComplexitylink();
		LoggerLoad.info("User is currently on Time ComplexityPage");
		dspage.clickTryhereBtn();
	}

	@And("user clicks and validates the ds link navigation")
	public void user_validates_the_link_navigation() {
		dspage.clickLinks();
		dspage.validateNavigatedDSLinks();
		LoggerLoad.info("User validates link navigation");

	}

}
