package com.appium.webApps;

import java.net.MalformedURLException;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeTest extends BaseClass
{
	   @Test
       public void chromeTest() throws MalformedURLException
       {
		   AndroidDriver<AndroidElement> driver = capabilities();
		   driver.get("https://www.google.com/");
       }
}
