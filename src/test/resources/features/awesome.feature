Feature: This is a awesome feature to have

Background:
    Given I am logged into the app

@awesome
Scenario: When I go the the one page it whould be awesome
        When I click the first page link
        Then I should see "foo"
        
@awesome
Scenario: When I go the the other page it whould be also awesome
        When I click the first page link
        Then I should see "bar"