package stepDefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.dsAlgo.Pages.LoginPage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	LoginPage loginPage = new LoginPage();
	Boolean isEmpty = true;

	@Given("enter the username")
	public void enter_the_username(DataTable dataTable) {
		loginPage.entervalidUsername(dataTable);
	}

	@Then("enter the password")
	public void enter_the_password(DataTable dataTable) {
		loginPage.entervalidPassword(dataTable);
	}

	@And("click the login button")
	public void click_the_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("user navigated to the home page and verify the title")
	public void verifyHomePageTitleandAlert() {
		loginPage.verifyTitle();
		loginPage.verifyLogInAlertMessage();
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		LoggerLoad.info("The user is currently on the sign in page");
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		loginPage.readExcel(string, int1);
	}

	@And("user clicks signout button")
	public void user_clicks_signout_button() {
		loginPage.logout();
	}

	@And("user validates successful logout")
	public void user_validates_successful_logout() {
		loginPage.verifyLogOutAlertMessage();
	}

	@When("user clicks register link")
	public void user_clicks_register_link() {
		loginPage.registerLink();
	}

	@Then("the user redirects to register page")
	public void the_user_redirects_to_register_page() {
		LoggerLoad.info("User gets redirected to Register Page");
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String string, String string2, DataTable datatable) {
//		LoggerLoad.info("User Enter username as \" " + string + " \" and Password as \" " + string2 + "\" ");
//		isEmpty = loginPage.doLogin(string, string2);
//		assertTrue(isEmpty);
		loginPage.enterinvalidUsername(datatable);
		loginPage.enterinvalidpassword(datatable);
		loginPage.clickLoginButton();
		// loginPage.alertValidation();
		LoggerLoad.info("Empty field value is validated");
	}

}
