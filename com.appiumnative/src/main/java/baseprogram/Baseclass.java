package baseprogram;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Baseclass {
	
	public static AndroidDriver<AndroidElement>driver;
	static String nodepath="C:\\Program Files\\nodejs\\node.exe";
	static String appiumpath="C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	static AppiumDriverLocalService service;
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	public static AndroidDriver<AndroidElement> testlaunch() throws MalformedURLException, InterruptedException
	{
	service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(nodepath))
				.withAppiumJS(new File(appiumpath))
			.withIPAddress("127.0.0.1").usingPort(4729));
		System.out.println("appium server started");
		service.start();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY322BRMJ5");
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		//AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver=new AndroidDriver<AndroidElement>(service.getUrl(),cap);
		service.stop();
		return driver;
	}
	
}
		/*some important methods 
		 driver.hideKeyboard(); to hide keyboard
		 driver.getcontext(); to get status whether our app is native,hybrid or Web view
		 driver.pressKeyCode(AndroidKeyCode.BACK); :-this method is used to simulate all key events in android for example this one will
		 press back button of mobile
		 driver.isLocked(); is used to check whether device is locked or not
		 */
	
	
//	cap.setCapability("appPackage","io.appium.android.apis");
//	cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");


