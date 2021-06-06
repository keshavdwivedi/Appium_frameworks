package mainprogram;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import baseprogram.Baseclass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeTest extends Baseclass {
	
	@Test
	public static void swipetestmethod() throws InterruptedException, MalformedURLException
	{
	AndroidDriver<AndroidElement>maindriver=testlaunch();
	TouchAction action=new TouchAction(maindriver);
	action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
	Thread.sleep(1200);
	action.tap(maindriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']")).perform();
	Thread.sleep(1000);
	action.tap(maindriver.findElementByXPath("(//android.widget.TextView)[3]")).perform();
	Thread.sleep(1000);
	action.tap(maindriver.findElementByXPath("//*[@content-desc='9']")).perform();
	Thread.sleep(1000);
	action.press(maindriver.findElementByXPath("//*[@content-desc='15']")).moveTo(maindriver.findElementByXPath("//*[@content-desc='45']")).waitAction().release().perform();
	maindriver.navigate().back();
	maindriver.quit();
	}
	
	

}
