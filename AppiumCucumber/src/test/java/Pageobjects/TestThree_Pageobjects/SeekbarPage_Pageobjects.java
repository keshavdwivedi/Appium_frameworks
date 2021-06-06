package Pageobjects.TestThree_Pageobjects;

import Utility.Baseutils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SeekbarPage_Pageobjects {

    Baseutils base;

    public SeekbarPage_Pageobjects(Baseutils base)
    {
        this.base=base;
        PageFactory.initElements(new AppiumFieldDecorator(base.driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Enabled']")public WebElement enablecheckbox;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@index='1']")public WebElement Seekbarone;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@index='2']")public WebElement Seekbartwo;

    public void handle_checkbox()
    {
        enablecheckbox.click();
    }

    public void handle_seekbar()
    {

        TouchAction action =new TouchAction(base.driver);
        //get X and Y coordinate of seekbarOne

        int start=Seekbarone.getLocation().getX();
        int y=Seekbarone.getLocation().getY();
        int end= Seekbarone.getSize().getWidth();

        //move seekbar to end
        action.press(start,y).waitAction(Duration.ofMillis(2000)).moveTo(end,y).waitAction(Duration.ofMillis(2000)).release().perform();

        //get X and Y coordinate of SeekbarTwo
        int starttwo=Seekbartwo.getLocation().getX();
        int yTwo=Seekbartwo.getLocation().getY();
        int endTwo=Seekbartwo.getSize().getWidth();

        //move second seekbar by 40%
        int moveto=(int)(endTwo*0.4);
        action.press(starttwo,yTwo).waitAction(Duration.ofMillis(2000)).moveTo(moveto,yTwo).waitAction(Duration.ofMillis(2000)).release().perform();


    }
}
