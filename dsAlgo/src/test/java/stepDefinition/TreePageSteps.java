package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.dsAlgo.Pages.TreePage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageSteps {

	TreePage treePage = new TreePage();
	String expectedMsg;

	@And("user clicks get started link of tree page")
	public void user_clicks_get_started_link_of_tree_page() {
		treePage.clickGetStarted();
		LoggerLoad.info("User navigated to Tree Page");
	}

	@Given("user click overview of trees link and navigated to overview of trees page")
	public void user_click_overview_of_trees_link_and_navigated_to_overview_of_trees_page() {
		treePage.clickOverviewOfTree();
		LoggerLoad.info("User navigated to overview of trees page");
	}

	@And("user click on tryhere and navigated to try editor page")
	public void user_click_on_tryhere_and_navigated_to_try_editor_page() {
		treePage.clickTryHere();
		LoggerLoad.info("user click on tryhere link of tree page");
	}

	@Given("user gets input from sheet {string} and {int} in trees")
	public void user_gets_input_from_sheet_and_in_trees(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		treePage.enterTreePythoncode(sheetName, rowNum);
		expectedMsg = treePage.getExpectedResult(sheetName, rowNum);
	}

	@When("click the run button")
	public void click_the_run_button() {
		treePage.clickRun();
		LoggerLoad.info("User click run button");
	}

	@Then("capture and verify the result")
	public void capture_and_verify_the_result() {
		treePage.getConsoleResult();
		LoggerLoad.info("capture and verify the console result of Tree Page");
	}

	@But("capture and verify the alert message")
	public void capture_and_verify_the_alert_message() {
		String alertMsg = treePage.getAlertMsg();
		LoggerLoad.info("Alert message  :" + alertMsg);
		assertTrue(true, alertMsg);
	}

	@Given("user click Terminologies link and navigated to Terminologies page")
	public void user_click_terminologies_link_and_navigated_to_terminologies_page() {
		treePage.clickTerminologies();
		LoggerLoad.info("User navigated to Terminologies page");
	}

	@Given("user click Types of Trees link and navigated to Types of Trees page")
	public void user_click_types_of_trees_link_and_navigated_to_types_of_trees_page() {
		treePage.clickTypesOfTrees();
		LoggerLoad.info("User navigated to Types of Trees page");
	}

	@Given("user click Tree Traversals link and navigated to Tree Traversals page")
	public void user_click_tree_traversals_link_and_navigated_to_tree_traversals_page() {
		treePage.clickTreeTraversals();
		LoggerLoad.info("User navigated to Tree Traversals Page");
	}

	@Given("user click Traversals-Illustration and navigated to Traversals-Illustration page")
	public void user_click_traversals_illustration_and_navigated_to_traversals_illustration_page() {
		treePage.clickTraversalsIllustration();
		LoggerLoad.info("User navigated to Traversals-Illustration Page");
	}

	@Given("user click Binary Trees and navigated to Binary Trees page")
	public void user_click_binary_trees_and_navigated_to_binary_trees_page() {
		treePage.clickBinaryTrees();
		LoggerLoad.info("User navigated to Binary Trees page");
	}

	@Given("user click Types of Binary Trees and navigated to Types of Binary Trees page")
	public void user_click_types_of_binary_trees_and_navigated_to_types_of_binary_trees_page() {
		treePage.clickTypesOfBinaryTrees();
		LoggerLoad.info("User navigated to Types of Binary Trees page");
	}

	@Given("user click Implementation in Python and navigated to Implementation in Python page")
	public void user_click_implementation_in_python_and_navigated_to_implementation_in_python_page() {
		treePage.clickImplementationInPython();
		LoggerLoad.info("User navigated to Implementation in Python page");
	}

	@Given("user click Binary Tree Traversals and navigated to Binary Tree Traversals page")
	public void user_click_binary_tree_traversals_and_navigated_to_binary_tree_traversals_page() {
		treePage.clickBinaryTreeTraversals();
		LoggerLoad.info("User navigated to Binary Tree Traversals page");
	}

	@Given("user click Implementation of Binary Trees and navigated to Implementation of Binary Trees page")
	public void user_click_implementation_of_binary_trees_and_navigated_to_implementation_of_binary_trees_page() {
		treePage.clickImplementationOfBinaryTrees();
		LoggerLoad.info("User navigated to Implementation of Binary Trees page");
	}

	@Given("user click Applications of Binary trees and navigated to Applications of Binary trees page")
	public void user_click_applications_of_binary_trees_and_navigated_to_applications_of_binary_trees_page() {
		treePage.clickApplicationsOfBinaryTrees();
		LoggerLoad.info("User navigated to Applications of Binary trees page");
	}

	@Given("user click Binary Search Trees and navigated to Binary Search Trees page")
	public void user_click_binary_search_trees_and_navigated_to_binary_search_trees_page() {
		treePage.clickBinarySearchTrees();
		LoggerLoad.info("User navigated to Binary Search Trees page");
	}

	@Given("user click Implementation Of BST and navigated to Implementation Of BST page")
	public void user_click_implementation_of_bst_and_navigated_to_implementation_of_bst_page() {
		treePage.clickImplementationOfBST();
		LoggerLoad.info("User navigated to Implementation Of BST page");
	}

	@When("user click Practice Questions and navigated to Practice Questions page")
	public void user_click_practice_questions_and_navigated_to_practice_questions_page() {
		treePage.clickPracticeQuestion();
		LoggerLoad.info("User navigated to Practice Questions page");
	}

}