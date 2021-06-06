package com.newAppiumPractice.Tests;

import org.testng.annotations.Test;
import com.newAppiumPractice.Base.AppiumPractice_base;
import com.newAppiumPractice.Pageobjects.AppiumPractice_PageFour;

public class AppiumPractice_FourthTest extends AppiumPractice_base {
	
	@Test
	public void test4() {
		//AppiumPractice_ReportSetup.tests=AppiumPractice_ReportSetup.extent.createTest("Test4 started");
		AppiumPractice_PageFour obj=new AppiumPractice_PageFour(driver);
		obj.checklogin();
		obj.handlePasswordcheckbox();
		obj.enterPassword("MTIzc2FpcmFt");
		obj.taploginBtn();
		obj.loggedinStatus();
	}
}
