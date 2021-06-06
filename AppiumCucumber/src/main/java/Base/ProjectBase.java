package Base;

import Utility.Baseutils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectBase extends Baseutils {

    private Baseutils base;
    DesiredCapabilities cap;
    String nodepath="C:\\Program Files\\nodejs\\node.exe";
    String Mainjspath="C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    AppiumDriverLocalService service;
   private String Serviceurl;

    public ProjectBase(Baseutils base)
    {
        this.base=base;
    }

    public String startservice() throws InterruptedException
    {
        service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File(nodepath))
                .withAppiumJS(new File(Mainjspath))
                .withIPAddress("127.0.0.1")
                .usingPort(4723).withLogFile(new File(System.getProperty("user.dir")+"//Logfiles//serverlog.txt")));
        service.start();
        Thread.sleep(5000);
        System.out.println("Appium server started at"+"\n"+df.format(new Date()));
        Serviceurl=service.getUrl().toString();
        return Serviceurl;
    }

    public void stopservice()
    {
        if((service.isRunning()==true))
        {
            service.stop();
            System.out.println("Appium server Stopped at "+"\n"+df.format(new Date()));
        }
    }

    /*@BeforeSuite
    public void startappium() throws InterruptedException, MalformedURLException {
        Serviceurl=startservice();
        driverSetup();
    }

    @AfterSuite
    public void stopappium()
    {
        stopservice();
    }*/


   @Before
   public void driverSetup() throws MalformedURLException,InterruptedException
   {
       if(base.driver==null)
       {
           Serviceurl=startservice();
          cap=new DesiredCapabilities();
          cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
          cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 6P");
          cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.example.android.apis");
          cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.example.android.apis.ApiDemos");
          base.driver=new AndroidDriver<AndroidElement>(new URL(Serviceurl),cap);
          System.out.println("New Android Driver instance has been invoked"+base.driver);
       }
   }

   @After
   public void teardown()
   {
       if(base.driver!=null)
       {
           base.driver.quit();
           System.out.println("Destroying Android Driver Instance");
       }
    stopservice();
   }






}
