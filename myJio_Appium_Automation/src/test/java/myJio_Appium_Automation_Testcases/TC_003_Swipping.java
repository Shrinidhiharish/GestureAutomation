package myJio_Appium_Automation_Testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import myJio_Appium_Automation_Base.BaseClass;

public class TC_003_Swipping extends BaseClass{
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = capabilities("real");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// TODO Auto-generated method stub
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
	driver.findElementByXPath("//*[@content-desc='7']").click();
	
	TouchAction touch = new TouchAction(driver);
	WebElement source = driver.findElementByXPath("//*[@content-desc='15']");
	WebElement dest = driver.findElementByXPath("//*[@content-desc='45']");
	touch.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(3))).moveTo(element(dest)).release().perform();
	
	
	}
}
