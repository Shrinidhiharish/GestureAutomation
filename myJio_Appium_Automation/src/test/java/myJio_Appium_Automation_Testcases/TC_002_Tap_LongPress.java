package myJio_Appium_Automation_Testcases;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import myJio_Appium_Automation_Base.BaseClass;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class TC_002_Tap_LongPress extends BaseClass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// TODO Auto-generated method stub
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction touch = new TouchAction(driver);
		WebElement expandable = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		touch.tap(tapOptions().withElement(element(expandable))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement longPress = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touch.longPress(longPressOptions().withElement(element(longPress)).withDuration(ofSeconds(2))).release()
				.perform();

	}

}
