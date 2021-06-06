package com.mobilchrome;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobileChromeTest1 extends mobilebrowserbase.MobilebrowserBaseclass {
	
	@Test
	public void chrometest1() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>testdriver=Mobilebase();
		testdriver.get("https://www.cricbuzz.com");
		((JavascriptExecutor)testdriver).executeScript("scroll(0,800)");
		Thread.sleep(2000);
		Assert.assertTrue(testdriver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		testdriver.quit();
		
	}

}
