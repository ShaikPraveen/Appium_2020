package com.appium.webApps;

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
        /*cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability("appPackage", "com.android.chrome");
        cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");*/
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaikpraveen\\Downloads\\chromedriver.exe");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
