package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.dsAlgo.Pages.ArrayPage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageSteps {

	ArrayPage arrayPage = new ArrayPage();
	static String expectedMsg;

	@Given("user is on array page")
	public void user_is_on_linked_list_page() {
		arrayPage.getStarted();
		LoggerLoad.info("User is currently on Array Page");

	}

	@Then("user check all the required links available for array page")
	public void user_check_all_the_required_links_available_for_array_page() {
		arrayPage.checkLinks();
		LoggerLoad.info("User checks all links available on Linked List Page");
	}

	@And("user validates the link navigation for array page")
	public void user_validates_the_link_navigation_for_array_page() {
		arrayPage.validateNavigatedLinks();
	}

	@Given("user is on Arrays In Python Page")
	public void user_is_on_arrays_in_python_page() {
		arrayPage.clickArraysinPython();
		LoggerLoad.info("User is currently on Arrays In Python Page");
	}

	@Given("user is on Arrays using list Page")
	public void user_is_on_arrays_using_list_page() {
		arrayPage.back();
		arrayPage.clickArraysUsingList();
		LoggerLoad.info("User is currently on Arrays using List Page");
	}

	@Given("user is on Basic operations in Lists Page")
	public void user_is_on_basic_operations_in_lists_page() {
		arrayPage.back();
		arrayPage.clickBasicOperationsList();
		LoggerLoad.info("User is currently on Basic operations in List Page");
	}

	@Given("user is on Applications of array page")
	public void user_is_on_applications_of_array_page() {
		arrayPage.back();
		arrayPage.clickAppofArray();
		LoggerLoad.info("User is currently on Application of Arrays Page");
	}

	@Then("user clicks on first practice question")
	public void user_clicks_on_first_practice_question() {
		arrayPage.practQues1();
		LoggerLoad.info("User is currently on practice question 1 Page");

	}

	@And("user enters the code for practice question in tryEditor from sheet {string} and {int}")
	public void user_enters_the_code_for_practice_question(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException, InterruptedException {
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		arrayPage.enterPythonCodePractice(sheetName, rowNum);
		expectedMsg = arrayPage.getExpectedResult(sheetName, rowNum);

	}

	@But("user enter invalid code syntax in tryEditor from sheet {string} and {int} clicking on Run button")
	public void user_enter_invalid_code_in_try_editor_from_sheet_and_clicking_on_run_button(String sheetName,
			Integer rowNum)
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		LoggerLoad.info("The user enter invalidvalid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		arrayPage.enterPythonCode(sheetName, rowNum);
		expectedMsg = arrayPage.getExpectedResult(sheetName, rowNum);
	}

	@Then("user validates the output for the practice question")
	public void user_validates_the_output_for_the_practice_question() {
		String actualMsg = arrayPage.getActualResult();
		LoggerLoad.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

	@Given("user is traversing to Arrays In Python Page")
	public void user_is_traversing_to_arrays_in_python_page() {
		arrayPage.back();
		arrayPage.clickArraysinPython();
		LoggerLoad.info("User is currently on Arrays in python Page");
		arrayPage.clickTryhereBtn();
	}

	@Given("user is traversing to Arrays Using List Page")
	public void user_is_traversing_to_arrays_using_list_page() {
		arrayPage.back();
		arrayPage.clickArraysUsingList();
		LoggerLoad.info("User is currently on Arrays using list Page");
		arrayPage.clickTryhereBtn();
	}

	@Given("user is traversing to Basic Operations in List Page")
	public void user_is_traversing_to_basic_operations_in_list_page() {
		arrayPage.back();
		arrayPage.clickBasicOperationsList();
		LoggerLoad.info("User is currently on Basic operations in list Page");
		arrayPage.clickTryhereBtn();
	}

	@Given("user is traversing to Applications of array Page")
	public void user_is_traversing_to_applications_of_array_page() {
		arrayPage.back();
		arrayPage.clickAppofArray();
		LoggerLoad.info("User is currently on Application of Arrays Page");
		arrayPage.clickTryhereBtn();
	}

	@Then("user clicks on second practice question")
	public void user_clicks_on_second_practice_question() {
		arrayPage.practQues2();
		LoggerLoad.info("User is currently on practice question 2 Page");

	}

	@Then("user clicks on third practice question")
	public void user_clicks_on_third_practice_question() {
		arrayPage.practQues3();
		LoggerLoad.info("User is currently on practice question 3 Page");

	}

	@Then("user clicks on fourth practice question")
	public void user_clicks_on_fourth_practice_question() {
		arrayPage.practQues4();
		LoggerLoad.info("User is currently on practice question 4 Page");

	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		String actualMsg = arrayPage.getErrorText();
		LoggerLoad.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg, "SyntaxError: bad input on line 1", "Result do not match");
	}

	@When("click the submit button")
	public void click_the_run_button() {
		arrayPage.clickSubmit();
		LoggerLoad.info("User click submit button");
	}

}
