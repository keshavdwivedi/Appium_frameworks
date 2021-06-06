package com.newAppiumPractice.Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumserverConfig {
	
	String nodepath="C:\\Program Files\\nodejs\\node.exe";
	 String Mainjspath="C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	 AppiumDriverLocalService service;
	 String Serviceurl;
	 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
	 
	 public String startservice() throws InterruptedException {
		    service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
		            .usingDriverExecutable(new File(nodepath))
		            .withAppiumJS(new File(Mainjspath)).withIPAddress("127.0.0.1")
		            .usingPort(4723)
		            .withLogFile(new File(System.getProperty("user.dir")+"\\Logfiles\\appiumLog.txt")));
		    service.start();
		    Serviceurl=service.getUrl().toString();
		    System.out.println("Appium server Started at "+"\n"+df.format(new Date()));
		    return Serviceurl;
		}

		public void stopservice()
		{
		    if(service.isRunning()==true)
		    {
		        service.stop();
		        System.out.println("Appium server Stopped at "+"\n"+df.format(new Date()));
		    }
		}

}



