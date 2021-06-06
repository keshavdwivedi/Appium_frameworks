package Pageobjects.TestTwo_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class ViewsSubmenu_Pageobjects {

    Baseutils base;

    public ViewsSubmenu_Pageobjects(Baseutils base) {
        this.base = base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")public WebElement Animationoption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Text']")public WebElement Textoption;

    public void checkViewsubmenu()
    {
        if (!(Animationoption.isDisplayed()))
        {
            System.out.println("Views submenu has been reached starting to swipe");
        }
    }

    public void scrolldown() throws InterruptedException
    {
        base.driver.findElements(new
                        ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Text\"));"));
        System.out.println("The scrolling has been done successfully");
    }

    public void click_Textoption()
    {
        TouchAction t=new TouchAction(base.driver);
        t.tap(Textoption).perform();
        System.out.println("Text option clicked successfully");
    }
}
