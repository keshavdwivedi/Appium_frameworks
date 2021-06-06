Feature: To test the View Section of application

  Background:

      Given I am on main menu of app

    Scenario: To navigate to Edittext view of Text section
      When we click on Views option of main menu
      Then I navigate to views submenu of app
      When I Scroll down to Text option of app
      Then I click on Text submenu option
      When I navigate to Text submenu
      And  I click on EditText option
      Then I validate the Edittext fields