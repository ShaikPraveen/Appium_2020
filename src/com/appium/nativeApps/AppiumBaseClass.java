package com.appium.nativeApps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumBaseClass
{
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{	  
		 File f=new File("src");
		 File f1=new File(f,"ApiDemos-debug.apk");
		
		 DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		 cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28"); 
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");//9
		 cap.setCapability(MobileCapabilityType.APP, f1.getAbsolutePath());

		 
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap); 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     return driver;
	}
}
