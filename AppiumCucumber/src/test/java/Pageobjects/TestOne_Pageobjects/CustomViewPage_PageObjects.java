package Pageobjects.TestOne_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CustomViewPage_PageObjects {

   private Baseutils base;

    public CustomViewPage_PageObjects(Baseutils base) {
        this.base = base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Custom View']")public WebElement CustomviewText;

    public void click_Customviewtext()
    {
        new TouchAction(base.driver).tap(CustomviewText).perform();
    }
}
