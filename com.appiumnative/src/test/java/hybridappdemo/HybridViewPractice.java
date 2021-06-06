package hybridappdemo;

import java.net.MalformedURLException;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import baseprogram.Baseclass;

public class HybridViewPractice extends Baseclass {

	
	@Test
	public void hybridtest() throws MalformedURLException, InterruptedException
	{
		driver=testlaunch();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		System.out.println("The view before clicking is "+driver.getContext());
		driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();                                                                                                                                                                      
		Set<String>contextnames=driver.getContextHandles();
		for(String context:contextnames)
		{
			System.out.println(context);
			if (context.contains("WEBVIEW"))
			{
				driver.context(context);
				System.out.println(context);
			}
		}
	}

}
