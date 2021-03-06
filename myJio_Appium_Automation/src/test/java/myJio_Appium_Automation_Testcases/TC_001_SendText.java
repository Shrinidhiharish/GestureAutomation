package myJio_Appium_Automation_Testcases;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import myJio_Appium_Automation_Base.BaseClass;


public class TC_001_SendText extends BaseClass{
	
	
	public static void main(String[] args) throws MalformedURLException {
		service=startServer();
		AndroidDriver<AndroidElement>driver=capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("testing");
		driver.findElementById("android:id/button1").click();
		service.stop();
		}
}

