package awesome.example;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class UglyFeatureStepdefs {
    @When("^I smash the first page$")
    public void I_smash_the_first_page() {
        // stuff here
    }

    @Then("^I should scream \"([^\"]*)\" $")
    public void I_should_scream(String link) {
        // stuff here
    }
}
