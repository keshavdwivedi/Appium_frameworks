package mainprogram;

import java.net.MalformedURLException;
import baseprogram.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ClickTest extends Baseclass {
	
	public static void maintest() throws MalformedURLException, InterruptedException
	{
	AndroidDriver<AndroidElement>maindriver=testlaunch();
	maindriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	Thread.sleep(1000);
	maindriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	maindriver.findElementById("android:id/checkbox").click();
	maindriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	maindriver.findElementById("android:id/edit").sendKeys("hello");
	maindriver.findElementsByClassName("android.widget.Button").get(1).click();
	maindriver.quit();
	//To use androiduiautomator to identify element it is done as:- 
	/*maindriver.findElementByAndroidUIAutomator("text(\"views\")").click(); this statement identify element with 
	text attribute value as 'views'*/
	
	}
	

}
