package com.gaanaAppBase;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class GaanaAppBaseclass {

	public AndroidDriver<AndroidElement> gaanabase() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY322BRMJ5");
		cap.setCapability("appPackage","com.gaana");
		cap.setCapability("appActivity","com.gaana.SplashScreenActivity");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}	
}
