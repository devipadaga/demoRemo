import java.net.MalformedURLException;
import java.net.URL;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SMS_AUTOMATE {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {


		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		
		dc.setCapability("appPackage", "com.google.android.apps.messaging");
		dc.setCapability("appActivity", "com.google.android.apps.messaging.home.HomeActivity");
		//dc.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(5000);
		
		//clicking OK
		driver.findElement(By.id("com.google.android.apps.messaging:id/start_chat_fab")).click();
		//clicking start chat
		driver.findElement(By.id("com.google.android.apps.messaging:id/start_chat_fab")).click();
		//clicking dial pad
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\'Switch between entering text and numbers\']")).click();
		driver.findElement(By.id("com.google.android.apps.messaging:id/action_ime_dialpad_toggle")).click();
		WebElement search=driver.findElement(By.id("com.google.android.apps.messaging:id/recipient_text_view"));
				//search.sendKeys("Bhavani");
				
				search.sendKeys("8801282109");
				search.clear();
				search.sendKeys("8801282109");
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				//search.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("com.google.android.apps.messaging:id/recipient_text_view")).sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("HIIII");
		Thread.sleep(5000);
		driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
		
		
		//another way to perform keys.ENTER
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(By.id("com.google.android.apps.messaging:id/recipient_text_view")), Keys.ENTER).build().perform();
//		
		
//		
//		
		

	}

}
