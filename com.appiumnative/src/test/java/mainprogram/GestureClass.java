package mainprogram;

import java.net.MalformedURLException;
import baseprogram.Baseclass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GestureClass extends Baseclass {
	
	public static void Gesturetestmethod() throws MalformedURLException, InterruptedException
	{
	AndroidDriver<AndroidElement>maindriver=testlaunch();
	TouchAction action=new TouchAction(maindriver);
	action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
	Thread.sleep(1000);
	action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	Thread.sleep(1000);
	action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']")).perform();
	Thread.sleep(2000);
	//action.press(maindriver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
	action.longPress(maindriver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
	AndroidElement element=maindriver.findElementByXPath("//android.widget.TextView[@text='Sample action']");
	System.out.println("The text of element of popup is:-"+element.getText());
	Thread.sleep(2000);
	action.tap(element).perform();
	maindriver.quit();
	}
}
