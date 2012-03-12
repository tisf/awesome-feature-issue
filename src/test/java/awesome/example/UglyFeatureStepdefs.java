package awesome.example;

import cucumber.DateFormat;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class UglyFeatureStepdefs extends BackgroundStepdefs {
	@When("^I smash the first page$")
	public void I_smash_the_first_page() {
		// stuff here
	}

	@Then("^I should scream \"([^\"]*)\" $")
	public void I_should_scream(String link) {
		// stuff here
	}	
}
