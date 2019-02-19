
 package testcase;
import com.objectrepository.demo.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {
	public static AndroidDriver driver=null;

	public static void main(String[] args) throws InterruptedException, NullPointerException, IOException {
		//Reading common.jsva
		Common com=new Common();
		TestCase test=new TestCase();
		
		//reading properties file
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src/test/java/com/objectrepository/demo/application.properties");
		obj.load(objfile);
		
		//setting desired properties
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.knack.merchantapp");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		//signIn
		//driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@bounds='[188,1153][533,1220]']")).click();
		driver.findElement(MobileBy.xpath(obj.getProperty("start"))).click();
		Thread.sleep(1000);
		//driver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[120,359][640,459]']")).sendKeys("testing9@mailinator.com");
		driver.findElement(MobileBy.xpath(obj.getProperty("email"))).sendKeys(obj.getProperty("emailId"));
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("pass"))).sendKeys(obj.getProperty("password"));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(1000);	
//		driver.findElement(MobileBy.xpath(obj.getProperty("forgetpass"))).click();
//		driver.findElement(MobileBy.xpath(obj.getProperty("signup"))).click();
		driver.findElement(MobileBy.xpath(obj.getProperty("signIn"))).click();
		Thread.sleep(5000);
		test.plusMentuTest(driver);
		//Business Dashboard
		//scroll find and click
//		String text="Client Added";
//		String uiSelector = "new UiSelector().textMatches(\"" + text + "\")";
//		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
//		driver.findElementByAndroidUIAutomator(command).click();
		
//		driver.findElement(MobileBy.xpath(obj.getProperty("bookDb"))).click();
//		Thread.sleep(5000);
//		driver.findElement(MobileBy.xpath(obj.getProperty("paymentDb"))).click();
//		Thread.sleep(5000);
//		driver.findElement(MobileBy.xpath(obj.getProperty("clientDb"))).click();
		//Thread.sleep(5000);
		
		//driver.quit();
		}
}