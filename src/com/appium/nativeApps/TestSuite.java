package com.appium.nativeApps;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value={
		             TC01_AppiumLocatorsTest.class,
		             TC02_TappingTest.class,
		             TC03_SwippingTest.class,
		             TC04_ScrollingTest.class,
		             TC05_DragAndDropTest.class
		             })
public class TestSuite{  
}
