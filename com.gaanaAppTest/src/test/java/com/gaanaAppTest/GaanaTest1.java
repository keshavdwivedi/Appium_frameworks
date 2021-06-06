package com.gaanaAppTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.gaanaAppBase.GaanaAppBaseclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GaanaTest1 extends GaanaAppBaseclass {
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>testdriver=gaanabase();
		
		testdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		TouchAction touch=new TouchAction(testdriver);
		//app permission handle code
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
		testdriver.findElementById("com.gaana:id/menu_icon").click();
		testdriver.findElementById("com.gaana:id/rl_empty_item_view").click();
		testdriver.findElementByXPath("//android.widget.TextView[@text='Push notifications']").click();
		//location of toggle button
		Point p=testdriver.findElementByXPath("(//android.widget.Switch)[3]").getLocation();
		//by default toggle was on we have to off it 
        touch.tap(p.x+100, p.y+30).perform();
        //after toggle off we have toggle on again 
        touch.tap(p.x+20, p.y+30).perform();
        testdriver.quit();
		
		
		
		
        
	}

}
