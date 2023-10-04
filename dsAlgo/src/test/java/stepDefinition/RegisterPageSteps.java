package stepDefinition;

import com.dsAlgo.Pages.RegisterPage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

	RegisterPage RegisterPage = new RegisterPage();

	@Given("user redirected to regiter page")
	public void user_redirected_to_regiter_page() {
		LoggerLoad.info("User is currently in Register page");
		RegisterPage.validateRegistrationTitle();
	}

	@When("the user enters the valid {string} and {string} and {string}")
	public void the_user_enters_the_valid_and_and(String string, String string2, String string3)
			throws InterruptedException {
		RegisterPage.generateRandomUsername();
		RegisterPage.generateRandomPassword();

	}

	@Then("the user clicks the register button")
	public void the_user_clicks_the_register_button() {
		RegisterPage.clickOnRegisterButton();
	}

	@Then("the user is redirected to homepage with the message {string}")
	public void the_user_is_redirected_to_homepage_with_the_message(String string) throws InterruptedException {
		RegisterPage.verifyTitleAndAlertMessage();
		RegisterPage.waitforTitle();
		RegisterPage.navigateBack();
		RegisterPage.refresh();

	}

	@When("user enters only {string} and clicks on register button")
	public void user_enters_only_and_clicks_on_register_button(String string, DataTable dataTable) {

		RegisterPage.entervalidUsername(dataTable);
		RegisterPage.clickOnRegisterButton();
	}

	@When("the user gets the warning message alert {string} below password textbox")
	public void the_user_gets_the_warning_message_alert_below_password_textbox(String string) {
		RegisterPage.alertValidation();
	}

	@When("user enters only {string} and {string} and clicks on register button")
	public void user_enters_only_and_and_clicks_on_register_button(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		RegisterPage.entervalidPassword(dataTable);
		RegisterPage.clickOnRegisterButton();
	}

	@When("the user gets the warning message alert {string} below confirm password textbox")
	public void the_user_gets_the_warning_message_alert_below_confirm_password_textbox(String string) {
		RegisterPage.alertValidation();
	}

	@When("user kept {string} and {string} and {string} all fields blank and clicks on register button")
	public void user_kept_and_and_all_fields_blank_and_clicks_on_register_button(String string, String string2,
			String string3) {
		RegisterPage.clickOnRegisterButton();
	}

	@When("the user gets the warning message alert {string} below username textbox")
	public void the_user_gets_the_warning_message_alert_below_username_textbox(String string) {
		RegisterPage.alertValidation();
	}

	@When("user enters valid {string} but incorrect {string} and {string}  and clicks on register button")
	public void user_enters_valid_but_incorrect_and_and_clicks_on_register_button(String string, String string2,
			String string3, io.cucumber.datatable.DataTable dataTable) {
		RegisterPage.entervalidUsername(dataTable);
		RegisterPage.entervalidPassword(dataTable);
		RegisterPage.enterinvalidconfirmPassword(dataTable);
	}

	@When("the user gets the error message as {string}")
	public void the_user_gets_the_error_message_as(String string) {
		RegisterPage.alertValidation();
	}

	@When("user clicks login link")
	public void user_clicks_login_link() {
		RegisterPage.loginLink();
	}

	@Then("the user redirects to login page")
	public void the_user_redirects_to_login_page() {
		LoggerLoad.info("User gets redirected to Login Page");
	}

}
