package StepDefinitions;

import Pageobjects.TestTwo_Pageobjects.MainMenu_Pageobjects;
import Pageobjects.TestTwo_Pageobjects.Textsubmenu_Pageobjects;
import Pageobjects.TestTwo_Pageobjects.ViewsSubmenu_Pageobjects;
import Utility.Baseutils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TextView_Steps {

    Baseutils base;
    MainMenu_Pageobjects mainobj;
    Textsubmenu_Pageobjects textobj;
    ViewsSubmenu_Pageobjects viewsobj;

    public TextView_Steps(Baseutils base, MainMenu_Pageobjects mainobj, Textsubmenu_Pageobjects textobj, ViewsSubmenu_Pageobjects viewsobj) {
        this.base = base;
        this.mainobj = mainobj;
        this.textobj = textobj;
        this.viewsobj = viewsobj;
    }

    @Given("^I am on main menu of app$")
    public void i_am_on_main_menu_of_app()  {

        if(!(mainobj.ViewsOption.isDisplayed()))
        {
            System.out.println(" Views option in Main menu has been validated successfully");
        }
    }

    @When("^we click on Views option of main menu$")
    public void we_click_on_Views_option_of_main_menu() {
        mainobj.click_Viewoption();
    }

    @Then("^I navigate to views submenu of app$")
    public void i_navigate_to_views_submenu_of_app() {
       viewsobj.checkViewsubmenu();
    }

    @When("^I Scroll down to Text option of app$")
    public void i_Scroll_down_to_Text_option_of_app() throws InterruptedException {
        viewsobj.scrolldown();
    }

    @Then("^I click on Text submenu option$")
    public void i_click_on_Text_submenu_option() {
        viewsobj.click_Textoption();
    }

    @When("^I navigate to Text submenu$")
    public void i_navigate_to_Text_submenu() {
        if(!(textobj.Edittextoption.isDisplayed()))
        {
            System.out.println(" Edit Text option in Text sub menu has been validated successfully");
        }
    }

    @When("^I click on EditText option$")
    public void i_click_on_EditText_option()  {
        textobj.click_edittext();
    }

    @Then("^I validate the Edittext fields$")
    public void i_validate_the_Edittext_fields() {
        System.out.println("Test has been validated");
    }
}
