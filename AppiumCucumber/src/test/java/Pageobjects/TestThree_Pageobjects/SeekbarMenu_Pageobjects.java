package Pageobjects.TestThree_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SeekbarMenu_Pageobjects {

    Baseutils base;

    public SeekbarMenu_Pageobjects(Baseutils base){
        this.base=base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")public WebElement Animationoption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Seek Bar']")public WebElement Seekbaroption;

    public void checkViewsubmenu()
    {
        if (!(Animationoption.isDisplayed()))
        {
            System.out.println("Views submenu has been reached starting to swipe");
        }
    }

    public void SwipetoSeekbar()
    {
        base.driver.findElements(new
                MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));"));
        System.out.println("Scrolled to seek bar option");
    }



    public void click_seekbar()
    {
        TouchAction t=new TouchAction(base.driver);
        t.tap(Seekbaroption).perform();
    }








}
