package com.mobilchrome;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import mobilebrowserbase.MobilebrowserBaseclass;

public class GoogleCaptcha extends MobilebrowserBaseclass {
	
	@Test
	public void frametestgooglecaptcha() throws MalformedURLException
	{
		AndroidDriver<AndroidElement>testdriver=Mobilebase();
		testdriver.get("https://www.google.com/recaptcha/api2/demo");
		int num=frameidentify(testdriver, By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		testdriver.switchTo().frame(num);
		testdriver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		/*
		 Suppose we have the id of verify button inside the second frame so if we want to click the verify button then we code is:- 
		 
		 testdriver.switchTo().defaultContent();
		 int num2=frameidentify(testdriver, By.xpath("//div[@class='verify']"));
		 testdriver.switchTo().frame(num2); //swaitch the driver to frame number which contains the element 
		 testdriver.findElement(By.xpath("//div[@class='verify']")).click(); //simply click on element after switching to required frame
		 */
	}

	public int frameidentify(AndroidDriver<AndroidElement> driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			int elementcount=driver.findElements(by).size();
			
			if(elementcount>0)
			{
				break;
			}
			
			else
			{
				System.out.println("continue looping");
			}
		}
		
		driver.switchTo().defaultContent();
		return i;
	}
}
