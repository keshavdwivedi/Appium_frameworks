package com.newAppiumPractice.Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.newAppiumPractice.utilities.AppiumPractice_Readconfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumPractice_base {
	
	protected static AppiumDriver<AndroidElement> driver=null;
	AppiumPractice_Readconfig readobj=new AppiumPractice_Readconfig();
	AppiumserverConfig serverconfig=new AppiumserverConfig();
	
	public ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest tests;
	public static Logger logger;
	
	@BeforeTest
	public void reportSetup() {
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/target/ExtentReports/"+"TestReport-"+dateName+".html");
		htmlreporter.config().setDocumentTitle("Test Automation Report for Amazon app");
		htmlreporter.config().setReportName("Functional Automation Test report");
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Hostname","Localhost");
		extent.setSystemInfo("User Name",System.getProperty("user.name"));
		extent.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		extent.setSystemInfo("User Location", System.getProperty("user.country"));
		extent.setSystemInfo("OS version", System.getProperty("os.version"));
		extent.setSystemInfo("Java Version",System.getProperty("java.version"));
		extent.setSystemInfo("Selenium version", "3.13.0");
		extent.setSystemInfo("Appium version","1.8");
		extent.setSystemInfo("Maven version","3.5.0");
	    extent.setSystemInfo("App used","Amazon app");
	}
	
	@AfterTest
	public void reportTeardown() {
		extent.flush();
	}
	
	@BeforeSuite
	public void baseSetup() throws MalformedURLException, InterruptedException {
		
		if(driver==null) {
			serverconfig.startservice();
			System.out.println("New android driver invoked");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,readobj.getdeviceName());
			cap.setCapability("appPackage",readobj.getpackageName());
			cap.setCapability("appActivity",readobj.getactivityName());
			driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	}
	

	@AfterSuite
    public void teardown() throws InterruptedException {

    Thread.sleep(10);
    if (driver!=null)
    {
        System.out.println("Android Driver has been destroyed");
        driver.quit();
        serverconfig.stopservice();
        driver=null;
    }
  }
	
	public static AppiumDriver<AndroidElement> getdriver() {
		return driver;
	}

}
