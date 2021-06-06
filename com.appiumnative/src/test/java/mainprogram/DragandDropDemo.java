package mainprogram;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import baseprogram.Baseclass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragandDropDemo extends Baseclass  {

	@Test
	public static void Testdragdrop() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>maindriver=testlaunch();
		TouchAction action=new TouchAction(maindriver);
		action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
	    action.tap(maindriver.findElementByXPath("//android.widget.TextView[@index='7']")).perform();
		action.longPress(maindriver.findElementsByClassName("android.view.View").get(2)).moveTo(maindriver.findElementsByClassName("android.view.View").get(0)).release().perform();
		String str=maindriver.findElementsByClassName("android.widget.TextView").get(3).getText();
		System.out.println("The Success message is"+str);
		Thread.sleep(5000);
		maindriver.quit();
	}
	

}
