package stepDefinition;

import com.dsAlgo.Pages.GraphPage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GraphPageSteps {

	GraphPage gp = new GraphPage();

	@Given("user is on Graph page")
	public void user_is_on_graph_page() {
		gp.clickGetStarted();
		LoggerLoad.info("User is currently on Graph Page");
	}

	@And("user check all the required links available for Graph page")
	public void user_check_all_the_required_links_available_for_graph_page() {
		gp.checkLinks();
		LoggerLoad.info("User checks all links available on Graph Page");
	}

	@And("user validates the link navigation for graph page")
	public void user_validates_the_link_navigation_from_graph_page() {
		gp.validateNavigatedLinks();
		LoggerLoad.info("User validates the link navigation");
	}

	@Given("user is on Graph link page")
	public void user_is_on_graph_link_page() {
		gp.clickGraphLink();
		LoggerLoad.info("User is currently on Graph Link Page");
	}

	@Given("user is on Graph Representations link")
	public void user_is_on_graph_representations_link() {
		gp.back();
		gp.clickGraphRepLink();
		LoggerLoad.info("User is currently on Graph Representation Link Page");
	}

	@Given("user is traversing to Graph link Page")
	public void user_is_traversing_to_graph_link_page() {
		gp.back();
		gp.clickGraphLink();
		LoggerLoad.info("User is currently on Graph Link Page");
		gp.clickTryhereBtn();
	}

	@Given("user is traversing to Graph Representation link Page")
	public void user_is_traversing_to_graph_representation_link_page() {
		gp.back();
		gp.clickGraphRepLink();
		LoggerLoad.info("User is currently on Graph Representation Link Page");
		gp.clickTryhereBtn();
	}

}
