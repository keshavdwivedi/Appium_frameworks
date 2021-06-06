package com.newAppiumPractice.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumPractice_Screenshotutil {
	
	public static String getScreenshotAs(AppiumDriver<AndroidElement>driver,String screenshotName) {
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/target/screenshots/"+screenshotName+"-"+dateName+".png";
		File destfile=new File(destination);
		try {
			FileUtils.copyFile(src, destfile);
		} catch (IOException e) {
			System.out.println("The exception occured is "+e.getMessage());
		}
		return destination;
	}
}
