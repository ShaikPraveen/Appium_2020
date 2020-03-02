package com.appium.practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumTest {
   
	public static void main(String[] args) throws MalformedURLException {
		
		File f=new File("src");
		//File f1=new File(f,"ApiDemos-debug.apk");
		//File f1=new File(f,"TestApp_v1.0_apkpure.com.apk");
		File f1=new File(f,"TestApp_v1.0_apkpure.com.apk");
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.APP, f1.getAbsolutePath());
		
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath(" //android.widget.TextView[@text='3. Preference dependencies']").click();	
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Fss");
		driver.findElementById("android:id/button1").click();*/
		
	}
}
