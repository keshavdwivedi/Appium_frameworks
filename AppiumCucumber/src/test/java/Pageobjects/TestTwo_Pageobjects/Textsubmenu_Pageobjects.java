package Pageobjects.TestTwo_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Textsubmenu_Pageobjects {

    Baseutils base;

    public Textsubmenu_Pageobjects(Baseutils base) {
        this.base = base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='EditText']")public WebElement Edittextoption;

    public void click_edittext()
    {
        TouchAction t=new TouchAction(base.driver);
        t.tap(Edittextoption).perform();;
    }


}
