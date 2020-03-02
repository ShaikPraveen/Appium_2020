package com.appium.nativeApps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC04_ScrollingTest extends AppiumBaseClass
{
      
	   @Test
	   public void scrollingTest() throws MalformedURLException
	   {
		   AndroidDriver<AndroidElement> driver = capabilities();
		   driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");//WebView
		   
		   driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
		   WebElement webview=driver.findElementByXPath("//android.widget.TextView[@text='Views/WebView']");
		   Assert.assertTrue(webview.isDisplayed());
		   System.out.println("4.Scrolling Test Pass ="+webview.isDisplayed());
		   driver.quit();
		   
	   }
}
