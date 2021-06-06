package com.newAppiumPractice.Tests;

import org.testng.annotations.Test;
import com.newAppiumPractice.Base.AppiumPractice_base;
import com.newAppiumPractice.Pageobjects.AppiumPractice_PageTwo;


public class AppiumPractice_SecondTest extends AppiumPractice_base {
	
	@Test
	public void test2() {
		//AppiumPractice_ReportSetup.tests=AppiumPractice_ReportSetup.extent.createTest("Test2 started");
		AppiumPractice_PageTwo two_obj=new AppiumPractice_PageTwo(driver);
		two_obj.verifySignintext();
		two_obj.clickSigninbutton();
		
	}

}
