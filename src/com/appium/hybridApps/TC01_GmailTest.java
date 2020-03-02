package com.appium.hybridApps;

import java.net.MalformedURLException;
import org.junit.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01_GmailTest extends BaseClass
{
	@Test
    public void gmailLoginTest() throws MalformedURLException
    {
		AndroidDriver<AndroidElement> driver = capabilities();  
    }
	
}
