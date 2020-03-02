package com.appium.nativeApps;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01_AppiumLocatorsTest extends AppiumBaseClass {

	@Test()
	public void TC01_LocatorsTest() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").clear();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Praveen");
		driver.findElementsByClassName("android.widget.Button").get(1).click();

		WebElement ele = driver
				.findElementByXPath("//android.widget.TextView[@text='Preference/3. Preference dependencies']");
		Assert.assertTrue("ELEMENT IS NOT DISPLAYED", ele.isDisplayed());
		System.out.println("1.Appium Locators Test Pass ="+ele.isDisplayed());
		driver.quit();
	}
}
