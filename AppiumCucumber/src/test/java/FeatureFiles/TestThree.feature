Feature: To test the seekbar of application

  Background:

    Given I am on the main menu of app

    @seek
    Scenario: To navigate to the seekbar and move the seekbar
      When we click on views option of the main menu
      Then I validate seekbar option by scrolling to it
      When I click on seekbar option
      Then move the seekbar and validate enable checkbox


