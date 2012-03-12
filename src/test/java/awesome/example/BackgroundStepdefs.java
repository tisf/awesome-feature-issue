package awesome.example;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public abstract class BackgroundStepdefs {
	@Given("^I am logged into the app$")
	public void I_am_logged_into_the_app() {
		// stuff here
	}
}	