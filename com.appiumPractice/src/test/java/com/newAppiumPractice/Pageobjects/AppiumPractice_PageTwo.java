package com.newAppiumPractice.Pageobjects;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.newAppiumPractice.Base.AppiumPractice_base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AppiumPractice_PageTwo {
	
	
	public AppiumPractice_PageTwo(AppiumDriver<AndroidElement>driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		AppiumPractice_base.logger=LogManager.getLogger(getClass());
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Already a customer? Sign in']")public AndroidElement signinButton;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign in to your account']")public AndroidElement signinText;
	
	public void verifySignintext() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Assert.assertTrue(signinText.isDisplayed(),"Signin Text not displayed");
	  AppiumPractice_base.logger.info("Sign in assertion passed");
	  AppiumPractice_base.tests.info("Sign in assertion passed");
	}
	
	public void clickSigninbutton() {
		signinButton.click();
	}
	
	

}
