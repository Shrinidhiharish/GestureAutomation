package mainrunner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class DesiredCapability {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator1");
		caps.setCapability("Platform", "Android");
		caps.setCapability("app", "E:\\Eclipse_Projects\\appiumFramework\\original.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.findElement(By.xpath("//android.widget.TextView[text='Views']")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Drag and Drop\")")).click();
		driver.quit();
	}

}
