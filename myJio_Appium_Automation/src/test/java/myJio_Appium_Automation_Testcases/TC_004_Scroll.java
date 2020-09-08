package myJio_Appium_Automation_Testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import myJio_Appium_Automation_Base.BaseClass;

public class TC_004_Scroll extends BaseClass{
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = capabilities("real");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

}
}
