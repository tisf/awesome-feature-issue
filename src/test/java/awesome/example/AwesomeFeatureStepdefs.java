package awesome.example;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class AwesomeFeatureStepdefs {
    @When("^I click the first page link$")
    public void I_click_the_first_page_link() {
        // stuff here
    }

    @Then("^I should see \"([^\"]*)\" $")
    public void I_should_see(String link) {
        // stuff here
    }
}
