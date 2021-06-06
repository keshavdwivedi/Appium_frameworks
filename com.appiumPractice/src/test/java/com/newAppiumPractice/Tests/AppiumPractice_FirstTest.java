package com.newAppiumPractice.Tests;


import org.testng.annotations.Test;
import com.newAppiumPractice.Base.AppiumPractice_base;
import com.newAppiumPractice.Pageobjects.AppiumPractice_PageOne;

public class AppiumPractice_FirstTest extends AppiumPractice_base {
	
	@Test
	public void test1() {
		AppiumPractice_PageOne obj=new AppiumPractice_PageOne(driver);
		obj.verifyswipe();
	}
}
