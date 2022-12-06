import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(5000);
		
		
		WebElement six=driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
		six.click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		WebElement four=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
		four.click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		String result=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		
		if(result.equals("10"))
			System.out.println("TEST PASSED");
		else
			System.out.println("TEST FAILED");
		
		Thread.sleep(5000);
	}

}
