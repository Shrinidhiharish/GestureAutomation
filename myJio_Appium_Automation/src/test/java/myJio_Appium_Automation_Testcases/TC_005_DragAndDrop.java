package myJio_Appium_Automation_Testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import myJio_Appium_Automation_Base.BaseClass;

public class TC_005_DragAndDrop extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities("real");	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
	WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
	WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);
	TouchAction drag = new TouchAction(driver);
}
}