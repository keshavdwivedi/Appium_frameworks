package com.newAppiumPractice.Pageobjects;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.newAppiumPractice.Base.AppiumPractice_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppiumPractice_PageThree {
	
	public AppiumPractice_PageThree(AppiumDriver<AndroidElement>driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		AppiumPractice_base.logger=LogManager.getLogger(getClass());
	}
	
	@AndroidFindBy(xpath="//android.view.View[@text='Welcome']")public AndroidElement welcometxt;
	@AndroidFindBy(id="ap_email_login")public AndroidElement mobfield;
	@AndroidFindBy(id="continue")public AndroidElement continuebtn;
	
	public void verifywelcometxt() {
		 new WebDriverWait(AppiumPractice_base.getdriver(),60).until(ExpectedConditions.visibilityOf(welcometxt));
		 Assert.assertTrue(welcometxt.isDisplayed(),"Welcome text not displayed");
	     AppiumPractice_base.logger.info("Welcome text verified");
	     AppiumPractice_base.tests.info("Welcome text verified");
	}
	
	public void fillmobfield(String number) {
		
		mobfield.sendKeys(number);
	}
	
	public void clickcontinueBtn() {
		continuebtn.click();
		AppiumPractice_base.logger.info("Continue button has been clicked");
		AppiumPractice_base.tests.info("Continue button has been clicked");
	}
	

}
