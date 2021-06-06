package Pageobjects.TestThree_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage_Pageobjects {

    Baseutils base;

    public MainPage_Pageobjects(Baseutils base) {
        this.base = base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")public WebElement ViewOption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Accessibility']")public WebElement AccessibilityOption;

    public void click_Viewoption()
    {
        TouchAction t=new TouchAction(base.driver);
        t.tap(ViewOption).perform();
    }

    public void check_mainpage()
    {
        if(!(AccessibilityOption.isDisplayed()))
        {
            System.out.println("On the main menu of app");
        }
    }


}
