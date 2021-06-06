package com.newAppiumPractice.Pageobjects;


import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.newAppiumPractice.Base.AppiumPractice_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;

public class AppiumPractice_PageFour {
	
	public AppiumPractice_PageFour(AppiumDriver<AndroidElement>driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		AppiumPractice_base.logger=LogManager.getLogger(getClass());
	}
	
	@AndroidFindBy(id="ap_password")public AndroidElement passwordfield;
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='Show password']")public AndroidElement showpwdcheckBox;
	@AndroidFindBy(id="signInSubmit")public AndroidElement loginBtn;
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/action_bar_burger_icon")public AndroidElement hamburgerIcon;
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/action_bar_home_logo")public AndroidElement hamburgerLogo;
	
	public void checklogin() {
		
		new WebDriverWait(AppiumPractice_base.getdriver(),50).until(ExpectedConditions.visibilityOf(passwordfield));
		Assert.assertTrue(passwordfield.isDisplayed(),"password field not visible");
		AppiumPractice_base.logger.info("Password field assertion passed and password field now visible");
		AppiumPractice_base.tests.info("Password field assertion passed and password field now visible");
	}
	
	public void handlePasswordcheckbox() {
		if(!(showpwdcheckBox.isSelected())) {
			showpwdcheckBox.click();
			AppiumPractice_base.logger.info("Password checkbox clicked");
			AppiumPractice_base.tests.info("Password checkbox clicked");
		}
	}
	
	public void enterPassword(String pwd) {
		String password=decodepassword(pwd);
		passwordfield.sendKeys(password);
	}
	
    public static String decodepassword(String pword)
		{
			byte[] decodedpassword=Base64.decodeBase64(pword);
			return new String(decodedpassword);
		}
	 
	 public void taploginBtn() {
		 new TouchAction<>(AppiumPractice_base.getdriver()).tap(ElementOption.element(loginBtn)).perform();
		 AppiumPractice_base.logger.info("Login button tapped");
		 AppiumPractice_base.tests.info("Login button tapped");
	 }
	 
	 public void loggedinStatus() {
		 new WebDriverWait(AppiumPractice_base.getdriver(),70).until(ExpectedConditions.visibilityOf(hamburgerIcon));
		 new TouchAction<>(AppiumPractice_base.getdriver()).tap(ElementOption.element(hamburgerIcon)).perform();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if(hamburgerLogo.isDisplayed()) {
			 AppiumPractice_base.tests.info("User logged in successfully");
			 AppiumPractice_base.logger.info("User logged in successfully");
		 }
		 else AppiumPractice_base.tests.info("User login not successful");
		 
	 }
	
	 
	
	
	
	

}
