package com.appium.nativeApps;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC03_SwippingTest extends AppiumBaseClass
{
	@Test
    public void SwipeTest() throws MalformedURLException
    {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction ta=new TouchAction(driver);
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		
		ta.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Views/Date Widgets/2. Inline']").isDisplayed());
		System.out.println("3.Swipping Test Pass");
		driver.quit();
    }
}
