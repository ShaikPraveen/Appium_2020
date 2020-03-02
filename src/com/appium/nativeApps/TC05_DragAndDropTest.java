package com.appium.nativeApps;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC05_DragAndDropTest extends AppiumBaseClass
{
	@Test
    public void dragAndDropTest() throws MalformedURLException
    {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction ta=new TouchAction(driver);
		//ta.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		ta.longPress(element(source)).moveTo(element(destination)).release().perform();
		
		WebElement ele=driver.findElementByClassName("android.widget.TextView");
		System.out.println("5.Drag and Drop Test Pass ="+ele.isDisplayed());
		driver.quit();
    }
}
