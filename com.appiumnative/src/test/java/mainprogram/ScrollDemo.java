package mainprogram;

import java.net.MalformedURLException;
import baseprogram.Baseclass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends Baseclass {
	
	public void Testscroll() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>maindriver=testlaunch();
		TouchAction action=new TouchAction(maindriver);
		action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Graphics']")).perform();
		maindriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ScaleToFit\"));");
		Thread.sleep(4000);
		maindriver.quit();
	}

}
