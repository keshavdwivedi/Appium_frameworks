package com.newAppiumPractice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class AppiumPractice_Readconfig {
	
	Properties pro;
	
	public AppiumPractice_Readconfig() {
		
		File src=new File("./Configuration/appconfig.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getdeviceName() {
		return pro.getProperty("devicename");
	}
	
	public String getpackageName() {
		return pro.getProperty("packagename");
	}
	
	public String getactivityName() {
		return pro.getProperty("activityname");
	}
	
}
