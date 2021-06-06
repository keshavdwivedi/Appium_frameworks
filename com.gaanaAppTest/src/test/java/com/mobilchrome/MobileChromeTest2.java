package com.mobilchrome;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import mobilebrowserbase.MobilebrowserBaseclass;

public class MobileChromeTest2 extends MobilebrowserBaseclass {
	
	@Test
	public void mobiletest2() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement>testdriver=Mobilebase();
		testdriver.get("https://www.udemy.com/");
		WebDriverWait w=new WebDriverWait(testdriver,20);
		w.until(ExpectedConditions.visibilityOf(testdriver.findElement(By.id("search-field-home"))));
		testdriver.findElement(By.id("search-field-home")).sendKeys("soapui"+Keys.ENTER);
		Thread.sleep(6000);
		testdriver.findElement(By.xpath("//h1[text()='WebServices/REST API Testing with SoapUI+ Real Time Projects']")).click();
		System.out.println(testdriver.getCurrentUrl());
		System.out.println(testdriver.getTitle());
		
	}
	
	
	

}
