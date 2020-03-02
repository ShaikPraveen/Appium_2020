package com.appium.hybridApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass 
{
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{	  
		DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
        cap.setCapability("appPackage", "com.google.android.apps.maps");
        cap.setCapability("appActivity", "com.google.android.apps.gmm.taxi.androidpay.BraintreeActivity");
        
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        return driver;
	}
}
