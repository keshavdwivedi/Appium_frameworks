package com.gaanaAppTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.gaanaAppBase.GaanaAppBaseclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GaanaTest3 extends GaanaAppBaseclass {
	
	
	public void test3() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>testdriver=gaanabase();
		testdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		while (testdriver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0)
		 {  
			testdriver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		testdriver.findElementByXPath("//android.widget.Button[@text='GET STARTED']").click();
		AndroidElement element=testdriver.findElementById("com.google.android.gms:id/cancel");
		Thread.sleep(1200);
		element.click();
		//testdriver.findElement(By.id("com.gaana:id/onboard_signup_footer")).click();
		testdriver.findElement(By.id("com.gaana:id/onboard_btn_google")).click();
		Thread.sleep(1000);
		testdriver.findElement(By.id("com.google.android.gms:id/account_name")).click();
		Thread.sleep(4000);
		testdriver.findElementByXPath("//android.widget.Button[@index='1']").click();
	}
	
	
	
	

}
