package awesome.example;

import cucumber.DateFormat;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class AwesomeFeatureStepdefs extends BackgroundStepdefs {
	@When("^I click the first page link$")
	public void I_click_the_first_page_link() {
		// stuff here
	}

	@Then("^I should see \"([^\"]*)\" $")
	public void I_should_see(String link) {
		// stuff here
	}	
}
