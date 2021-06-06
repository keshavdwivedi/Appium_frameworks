package mobilebrowserbase;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobilebrowserBaseclass {

	public AndroidDriver<AndroidElement>Mobilebase() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY322BRMJ5");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}	
}
