package com.newAppiumPractice.utilities;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.newAppiumPractice.Base.AppiumPractice_base;

public class AppiumPractice_ReportSetup extends AppiumPractice_base implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
     tests=extent.createTest(result.getName()+" Test has been started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		tests.log(Status.PASS, result.getName()+" Test has been passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		tests.log(Status.FAIL,result.getName() + " Test has been failed");
		tests.log(Status.FAIL,"Error has occured in Test  "+result.getName()+" is as follows "+"  "+result.getThrowable());
		
		String screenshotpath=AppiumPractice_Screenshotutil.getScreenshotAs(AppiumPractice_base.getdriver(),result.getName());
		try {
			tests.addScreenCaptureFromPath(screenshotpath);
		} catch (IOException e) {
			System.out.println("The exception occured is "+e.getMessage());
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		tests.log(Status.SKIP, result.getName()+" Test has been skipped");
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
