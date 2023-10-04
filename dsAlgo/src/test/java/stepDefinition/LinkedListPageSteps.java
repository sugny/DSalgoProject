package stepDefinition;

import java.io.IOException;

import com.dsAlgo.Pages.LinkedListPage;
import com.dsAlgo.utils.LoggerLoad;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LinkedListPageSteps {

	LinkedListPage llp = new LinkedListPage();

	static String expectedMsg;

	@Given("user is on linked list page")
	public void user_is_on_linked_list_page() {

		llp.clickGetStarted();
		LoggerLoad.info("User is currently on Linked List Page");

	}

	@And("user check all the required links available for linked list page")
	public void user_check_all_the_required_links_available_for_linked_list_page() {
		llp.checkLinks();
		LoggerLoad.info("User checks all links available on Linked List Page");

	}

	@And("The user navigates back")
	public void the_user_navigates_back() {
		llp.back();
	}

	@Then("user clicks on each link")
	public void user_clicks_on_each_link() {
		llp.clickLinks();
		LoggerLoad.info("User clicks all links available ");

	}

	@And("user validates the link navigation")
	public void user_validates_the_link_navigation() {
		llp.validateNavigatedLinks();
		LoggerLoad.info("User validates link navigation");

	}

	@Given("user is on Introduction Page")
	public void user_is_on_introduction_page() {
		llp.clickIntroduction();
		LoggerLoad.info("User is currently on Introduction Page");
	}

	@Given("user clicks the Try here button")
	public void user_clicks_the_try_here_button() {
		llp.clickTryhereBtn();
	}

	@Then("user enters the code to check the output")
	public void user_enters_the_code_to_check_the_output() {
		llp.entercode();
		llp.clickRun();
	}

	@Then("user validates the output")
	public void user_validates_the_output() {
		llp.validateOutput();
	}

	@Given("user is on creating linked list Page")
	public void user_is_on_creating_linked_list_page() {
		llp.back();
		llp.clickCreatingLinkedLists();
		LoggerLoad.info("User is currently on Creating Linked List Page");
	}

	@Given("user is on types of linked list link Page")
	public void user_is_on_types_of_linked_list_link_page() {
		llp.back();
		llp.clickLinkedListTypes();
		LoggerLoad.info("User is currently on Types of Linked list Page");
	}

	@Given("user is on implement linked list link Page")
	public void user_is_on_implement_linked_list_link_page() {
		llp.back();
		llp.clickImplementLinkedList();
		LoggerLoad.info("User is currently on Implementing Linked List Page");
	}

	@Given("user is on traversal link Page")
	public void user_is_on_traversal_link_page() {
		llp.back();
		llp.clickTraversal();
		LoggerLoad.info("User is currently on Traversal Page");
	}

	@Given("user is on insertion link Page")
	public void user_is_on_insertion_link_page() {
		llp.back();
		llp.clickInsertion();
		LoggerLoad.info("User is currently on Insertion Page");
	}

	@Given("user is on deletion link Page")
	public void user_is_on_deletion_link_page() {
		llp.back();
		llp.clickDeletion();
		LoggerLoad.info("User is currently on Deletion Page");
	}

	@Given("user is on practice questions Page")
	public void user_is_on_practice_questions_page() {
		llp.back();
		llp.clickPracticeQuestions();
		LoggerLoad.info("User is currently on Practice Questions Page");
	}

	@Given("user validate the title")
	public void user_validate_the_title() {
		llp.titleValidation();
	}

	@Given("user is traversing to Introduction Page")
	public void user_is_traversing_to_introduction_page() {
		try {
			llp.back();
		} catch (Exception e) {
			LoggerLoad.info("User no need to navigate" + e);
		}
		llp.clickIntroduction();
		LoggerLoad.info("User is currently on Introduction List Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to creating linked list Page")
	public void user_is_traversing_to_creating_linked_list_page() {
		llp.back();
		llp.clickCreatingLinkedLists();
		LoggerLoad.info("User is currently on Creating Linked List Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to types of linked list link Page")
	public void user_is_traversing_to_types_of_linked_list_link_page() {
		llp.back();
		llp.clickLinkedListTypes();
		LoggerLoad.info("User is currently on Types of Linked list Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to implement linked list link Page")
	public void user_is_traversing_to_implement_linked_list_link_page() {
		llp.back();
		llp.clickImplementLinkedList();
		LoggerLoad.info("User is currently on Implementing Linked List Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to traversal link Page")
	public void user_is_traversing_to_traversal_link_page() {
		llp.back();
		llp.clickTraversal();
		LoggerLoad.info("User is currently on Traversal Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to insertion link Page")
	public void user_is_traversing_to_insertion_link_page() {
		llp.back();
		llp.clickInsertion();
		LoggerLoad.info("User is currently on Insertion Page");
		llp.clickTryhereBtn();
	}

	@Given("user is traversing to deletion link Page")
	public void user_is_traversing_to_deletion_link_page() {
		llp.back();
		llp.clickDeletion();
		LoggerLoad.info("User is currently on Deletion Page");
		llp.clickTryhereBtn();
	}

	@But("user enter invalid code in tryEditor from sheet {string} and {int} clicking on Run button")
	public void user_enter_invalid_code_in_try_editor_from_sheet_and_clicking_on_run_button(String sheetName,
			Integer rowNum)
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		llp.enterPythonCode(sheetName, rowNum);
		expectedMsg = llp.getExpectedResult(sheetName, rowNum);
		llp.clickRun();
	}

	@Then("The user should get the error message")
	public void the_user_should_get_the_error_message() {
		llp.handleAlert();
	}
}
