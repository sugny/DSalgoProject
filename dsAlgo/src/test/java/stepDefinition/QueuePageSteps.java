package stepDefinition;

import com.dsAlgo.Pages.QueuePage;

import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class QueuePageSteps {
	QueuePage queuepage = new QueuePage();

	@Given("user should click on get started")
	public void user_should_click_on_get_started() {
		queuepage.enterbtn();
		LoggerLoad.info("user is now at get started page");

	}

	@Then("user should select queue element")
	public void user_should_select_queue_element() {
		queuepage.enterqueue();
		LoggerLoad.info("user is now at queue page");

	}

	@And("user should select the implementation option")
	public void user_should_select_the_implementation_option() {
		queuepage.enterimplimentationbtn();
		LoggerLoad.info("user is now at implementation page");

	}

	@Then("user should click on tryhere button")
	public void user_should_click_on_tryhere_button() {
		queuepage.selecttryherebtn();
		LoggerLoad.info("user is now at tryhere page");
	}

	@And("user should enter text")
	public void user_should_enter_text() {
		queuepage.presenttext4();
		LoggerLoad.info("user is now at enter text page");
	}

	@Then("user should run the code given")
	public void user_should_run_the_code_given() {
		queuepage.runbtn4();
		LoggerLoad.info("user is now at run page");

	}

	@Given("user should select on imlementation of collection option")
	public void user_should_select_on_imlementation_of_collection_option() {
		queuepage.enterusingcollection();
		LoggerLoad.info("user is now at collection page");

	}

	@Given("user should select on imlementation of array option")
	public void user_should_select_on_imlementation_of_array_option() {
		queuepage.enterusingarray();
		LoggerLoad.info("user is now at using array page");
	}

	@Given("user should select on queue operation option")
	public void user_should_select_on_queue_operation_option() {
		queuepage.enterqueueoperation();
		LoggerLoad.info("user is now at queue operations page");
	}

	@Given("user should select the practice question option")
	public void user_should_select_the_practice_question_option() {
		queuepage.clickpracticeque();
		LoggerLoad.info("user is now at practice que page");
	}

	@Then("user should click on it")
	public void user_should_click_on_it() {
		queuepage.verifyTitlePage();
		LoggerLoad.info("user is now at title page");
	}

	@Given("user is traversing to Implementation of queue Page")
	public void user_should_traverse_the_Implementation_of_queue() {
		queuepage.enterimplimentationbtn();
		queuepage.clicktryherebtn();
		LoggerLoad.info("User is now on Implementation of queue  Page");
	}

	@Given("user is traversing to Implementation using collection deque Page")
	public void user_should_traverse_the_Implementation_using_collection_dequeue() {
		queuepage.enterusingcollection();
		queuepage.clicktryherebtn();
		LoggerLoad.info("User is now on Implementation using collection deque  Page");
	}

	@Given("user is traversing to Implementation using array of queue Page")
	public void user_should_traverse_the_Implementation_using_array_queue() {
		queuepage.enterusingarray();
		queuepage.clicktryherebtn();
		LoggerLoad.info("User is now on Implementation using array of queue Page");
	}

	@Given("user is traversing to queue operations Page")
	public void user_should_traverse_the_queue_operations() {
		queuepage.enterqueueoperation();
		queuepage.clicktryherebtn();
		LoggerLoad.info("User is now on queue operations  Page");
	}

}