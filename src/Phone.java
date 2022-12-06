import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Phone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		dc.setCapability("appPackage", "com.truecaller");
		dc.setCapability("appActivity", "com.truecaller.DialerActivityAlias");	
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(5000);
		


//		
//		driver.findElement(By.id("com.truecaller:id/nextButton")).click();  //get started
//		driver.findElement(By.id("android:id/button2")).click();
//		
//			System.out.println("DONE 1ST CANCEL");
//		driver.findElement(By.id("android:id/button2")).click();
//			System.out.println("DONE 2ND CANCEL");
//		driver.findElement(By.id("android:id/button1")).click();
//			System.out.println("CLICKED ON CONTINUE");
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//			System.out.println("Clicked on ALLOW");
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//			System.out.println("Clicked on ALLOW");
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//			System.out.println("Clicked on ALLOW");
//		driver.findElement(By.id("android:id/button2")).click();  //CANCEL
//			System.out.println("Clicked on CANCEL");
//		
////		// cancel
//		//driver.findElement(By.id("com.android.permissioncontroller:id/dont_ask_again")).click();
//		//driver.findElement(By.id("android:id/button1")).click();
//		

	}

}
