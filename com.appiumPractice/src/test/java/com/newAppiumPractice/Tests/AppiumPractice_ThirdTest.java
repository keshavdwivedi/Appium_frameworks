package com.newAppiumPractice.Tests;

import org.testng.annotations.Test;
import com.newAppiumPractice.Base.AppiumPractice_base;
import com.newAppiumPractice.Pageobjects.AppiumPractice_PageThree;

public class AppiumPractice_ThirdTest extends AppiumPractice_base {
	
	@Test
	public void test3() {
		//AppiumPractice_ReportSetup.tests=AppiumPractice_ReportSetup.extent.createTest("Test3 started");
		AppiumPractice_PageThree threeobj=new AppiumPractice_PageThree(driver);
		threeobj.verifywelcometxt();
		threeobj.fillmobfield("7388891758");
		threeobj.clickcontinueBtn();
	}
	
	

}
