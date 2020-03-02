package com.appium.nativeApps;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class TC02_TappingTest extends AppiumBaseClass
{
      @Test	
	  public void TappingTest() throws MalformedURLException
	  {
    	  AndroidDriver<AndroidElement> driver = capabilities();
		  driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		  
		  TouchAction ta=new TouchAction(driver);
		  WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	      ta.tap(tapOptions().withElement(element(expandList))).perform();
	      
	      WebElement custadapter=driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
	      ta.tap(tapOptions().withElement(element(custadapter))).perform();
	      
	      WebElement pn=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	      ta.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	      
	      String menu_text=driver.findElementById("android:id/title").getText();
	      if (menu_text.contains("Sample")) 
	       {
	    	System.out.println("2.Tapping Test Pass");  
			Assert.assertTrue(true);
		} else {
			System.out.println("TEST FAIL");  
			Assert.assertTrue(false);
		}
	      driver.quit();  
	  }
}
