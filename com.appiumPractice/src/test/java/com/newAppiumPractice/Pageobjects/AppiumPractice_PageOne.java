package com.newAppiumPractice.Pageobjects;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import com.newAppiumPractice.Base.AppiumPractice_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumPractice_PageOne {
	
	public AppiumPractice_PageOne(AppiumDriver<AndroidElement>driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		AppiumPractice_base.logger=LogManager.getLogger(getClass());
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Amazon Shopping']")public MobileElement appIcon;
	
	public void swipehorizontal(AppiumDriver<AndroidElement>Driver,double start_percent,double end_percent) {
		Dimension size=Driver.manage().window().getSize();
		int y=(int)(size.height*0.50);
		int startx=(int)(size.width*start_percent);
		int endx=(int)(size.width*end_percent);
		new TouchAction<>(Driver).press(PointOption.point(startx,y)).waitAction().moveTo(PointOption.point(endx,y)).release().perform();
	}
	
	public void verifyswipe() {
		boolean flag=false;
		
		for(int i=1;i<5;i++) {
			try {
				
				AppiumPractice_base.getdriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
				if(appIcon.isDisplayed()) {
					flag=true;
				}
				
			 } catch (Exception e) {
				swipehorizontal(AppiumPractice_base.getdriver(),0.75,0.25);
			}
		}
		
		if(flag==true) {
			appIcon.click();
			AppiumPractice_base.tests.info("App icon clicked");
			AppiumPractice_base.logger.info("app clicked");
		}
	}
	
	

}
