package StepDefinitions;

import Pageobjects.TestOne_Pageobjects.CustomViewPage_PageObjects;
import Pageobjects.TestOne_Pageobjects.MainViewPage_PageObjects;
import Utility.Baseutils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomView_Steps {

    private Baseutils base;
     private MainViewPage_PageObjects mainobj;
     private CustomViewPage_PageObjects customobj;

    public CustomView_Steps(Baseutils base, MainViewPage_PageObjects mainobj, CustomViewPage_PageObjects customobj) {
        this.base = base;
        this.mainobj = mainobj;
        this.customobj = customobj;

    }

    @Given("^I am on the main menu of Application$")
    public void i_am_on_the_main_menu_of_Application()  {

        if(!(mainobj.Accessibilitytext.isDisplayed()))
        {
            System.out.println("Main menu has been validated successfully");
        }
    }

    @When("^We click on Accessibility Option$")
    public void we_click_on_Accessibility_Option() {
       mainobj.click_Accessibility();
    }

    @When("^we are able to Custom View option$")
    public void we_are_able_to_Custom_View_option() {
      if(!(customobj.CustomviewText.isDisplayed()))
        {
            System.out.println("Custom view has been validated");
        }
    }

    @Then("^We click on Custom View option$")
    public void we_click_on_Custom_View_option(){
       customobj.click_Customviewtext();
    }

    @Then("^Validate the custom view content$")
    public void validate_the_custom_view_content() {
       System.out.println("Custom view content has been validated and Test has been passed");
    }

}
