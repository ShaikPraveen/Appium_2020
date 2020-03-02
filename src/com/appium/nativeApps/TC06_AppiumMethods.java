package com.appium.nativeApps;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//https://codoid.com/appium-commands/

public class TC06_AppiumMethods extends AppiumBaseClass {
	@Test
	public void appiumMethods() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		driver.lockDevice();
		driver.unlockDevice();
		boolean isLocked = driver.isDeviceLocked();
		System.out.println(isLocked);
		// To display the device keyboard
		driver.getKeyboard();
		// To hide the device keyboard
		driver.hideKeyboard();
		// To verify the keyboard is displayed
		driver.isKeyboardShown();
		// To open the notification
		driver.openNotifications();
     	// Get the device current time
		System.out.println(driver.getDeviceTime());
		// get current location of the device
		System.out.println(driver.location());
		// To retrieve the full capabilities associated with the driver
		System.out.println(driver.getCapabilities());
		// Use this call to retrieve a SessionID
		System.out.println(driver.getSessionId());
	}
}
