Feature: To test the Custom View Feature

  Background:
    Given  I am on the main menu of Application

  Scenario: To Navigate to custom view option
    When We click on Accessibility Option
    And we are able to Custom View option
    Then We click on Custom View option
    And Validate the custom view content
