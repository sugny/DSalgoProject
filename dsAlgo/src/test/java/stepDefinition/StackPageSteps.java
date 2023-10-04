package stepDefinition;

import com.dsAlgo.Pages.StackPage;

import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StackPageSteps {

	StackPage stackpage = new StackPage();

	@Given("user should click the get started button")
	public void user_should_click_get_started_button() {
		stackpage.enterstack();
		LoggerLoad.info("user is now at get started page");
	}

	@And("user should select the operatins in stack option")
	public void user_should_select_the_operatins_in_stack_option() {
		stackpage.selectoperations();
		LoggerLoad.info("user is now at operations page");

	}

	@Then("The user should navigate to select try here option and click on it")
	public void The_user_should_navigate_to_select_try_here_option_and_click_on_it() {
		stackpage.clickontrybtn();
		LoggerLoad.info("user is now at try here page");
	}

	@And("user is navigated to a page having an tryEditor with a Run button to test")
	public void user_is_navigated_to_a_page_having_an_tryEditor_with_a_Run_button_to_test() {
		stackpage.presenttext();
		LoggerLoad.info("user is now at try editor page");
	}

	@And("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void The_user_clicks_on_Run_button_after_Entering_valid_pythoncode_in_stack_tryEditor() {
		stackpage.runbtn();
		LoggerLoad.info("user is now at run page");
	}

	@Given("The user should navigate to the implimantaion option in stack page")
	public void The_user_should_navigate_to_the_implimantaion_option_in_stack_page() {
		stackpage.implementationbtn();
		LoggerLoad.info("user is now at impementation page");
	}

	@And("user should click on try here button")
	public void user_should_click_on_try_here_button() {
		stackpage.Tryherebtn();
		LoggerLoad.info("user is now at impementation try here page");
	}

	@Then("the user should enter data to perform")
	public void the_user_should_enter_data_to_perform() {
		stackpage.presenttext2();
		LoggerLoad.info("user is now at impementation try editor page");
	}

	@And("the user should run the code for output")
	public void the_user_should_run_the_code_for_output() {
		stackpage.runbtn2();
		LoggerLoad.info("user is now at impementation run page");
	}

	@Given("The user should select the application option and click on it")
	public void the_user_should_select_the_application_option_and_click_on_it() {
		stackpage.selectapplication();
		LoggerLoad.info("user is now at application page");

	}

	@And("user should click on try here option")
	public void user_should_click_on_try_here_option() {
		stackpage.tryhere3();
		LoggerLoad.info("user is now at tryhere page");

	}

	@Then("the user should enter code to perform")
	public void the_user_should_enter_code_to_perform() {
		stackpage.presenttext3();
		LoggerLoad.info("user is now at application try editor page");
	}

	@And("the user should run the data for output")
	public void the_user_should_run_the_data_for_output() {
		stackpage.runbtn3();
		LoggerLoad.info("user is now at application run page");
	}

	@Given("The user is now in practice question page")
	public void the_user_is_now_in_practice_question_page() {
		stackpage.clickpracticebtn();
		LoggerLoad.info("User is now on Practice Questions Page");
	}

	@Given("user is traversing to  Operations in stack Page")
	public void user_traversing_Operations_Page() {
		stackpage.selectoperations();
		stackpage.Tryherebtn();
		LoggerLoad.info("User is now on Operations in stack Page");
	}

	@Given("user is traversing to Implementation page in stack Page")
	public void user_traversing_Implementation_Page() {
		stackpage.implementationbtn();
		stackpage.Tryherebtn();
		LoggerLoad.info("User is now on Operations in stack Page");
	}

	@Given("user is traversing to Applications page in stack Page")
	public void user_traversing_Application_Page() {
		stackpage.selectapplication();
		stackpage.Tryherebtn();
		LoggerLoad.info("User is now on Operations in stack Page");
	}

}