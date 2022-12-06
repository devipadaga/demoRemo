import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAPPonVirtualDevice {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"33");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkFiles\\Telegram.apk");
		
		//to open appium server
		//URL url=new URL("http://4723/wd/hub");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		//To install app in our device
		//AndroidDriver driver=new AndroidDriver(url,dc);
		AppiumDriver driver1=new AppiumDriver(url,dc);
		
		System.out.println("TEST PASSED");
		
		

	}

}
