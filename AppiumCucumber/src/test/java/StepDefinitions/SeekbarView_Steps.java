package StepDefinitions;

import Pageobjects.TestThree_Pageobjects.MainPage_Pageobjects;
import Pageobjects.TestThree_Pageobjects.SeekbarMenu_Pageobjects;
import Pageobjects.TestThree_Pageobjects.SeekbarPage_Pageobjects;
import Utility.Baseutils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeekbarView_Steps {

    Baseutils base;
    MainPage_Pageobjects mainobj;
    SeekbarMenu_Pageobjects seekobj;
    SeekbarPage_Pageobjects seekbarobj;

    public SeekbarView_Steps(Baseutils base, MainPage_Pageobjects mainobj, SeekbarMenu_Pageobjects seekobj, SeekbarPage_Pageobjects seekbarobj)
    {
        this.base=base;
        this.mainobj=mainobj;
        this.seekobj=seekobj;
        this.seekbarobj=seekbarobj;
    }

    @Given("^I am on the main menu of app$")
    public void i_am_on_the_main_menu_of_app() {
     mainobj.check_mainpage();
    }

    @When("^we click on views option of the main menu$")
    public void we_click_on_views_option_of_the_main_menu() {
       mainobj.click_Viewoption();
    }

    @Then("^I validate seekbar option by scrolling to it$")
    public void i_validate_seekbar_option_by_scrolling_to_it() {
        seekobj.checkViewsubmenu();
        seekobj.SwipetoSeekbar();
    }

    @When("^I click on seekbar option$")
    public void i_click_on_seekbar_option()  {
      seekobj.click_seekbar();
    }

    @Then("^move the seekbar and validate enable checkbox$")
    public void move_the_seekbar_and_validate_enable_checkbox() {
        seekbarobj.handle_checkbox();
        seekbarobj.handle_seekbar();
    }
}
