package com.gaanaAppTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.gaanaAppBase.GaanaAppBaseclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test
public class GaanaTest2 extends GaanaAppBaseclass {
	
	public void test2() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>testdriver=gaanabase();
		testdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		TouchAction touch=new TouchAction(testdriver);
		while (testdriver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0)
		 {  
			testdriver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		testdriver.findElementByXPath("//android.widget.Button[@text='GET STARTED']").click();
		AndroidElement element=testdriver.findElementById("com.google.android.gms:id/cancel");
		Thread.sleep(1200);
		element.click();
		testdriver.navigate().back();
		testdriver.findElementByXPath("//android.widget.Button[@index='1']").click();
		//tapped on trending songs list and then search for some song and tap to play it
		touch.tap(testdriver.findElementByXPath("//android.widget.TextView[@text='Trending Songs']")).perform();
		testdriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Something Just Like This\"));");
		touch.tap(testdriver.findElementByXPath("//android.widget.TextView[@text='Something Just Like This']")).perform();
		Thread.sleep(5000);
		testdriver.quit();
	}	

}
