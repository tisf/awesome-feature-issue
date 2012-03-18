Feature: This is an ugly feature to have

  Background:
    Given I am logged into the app

  @ugly
  Scenario: When I smash something I should get hurt
    When I smash the first page
    Then I should scream "auuuch"
