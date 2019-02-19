package testcase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Common {
	
	public void allowAppPermission(AndroidDriver driver){	
		
		 while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		}
	public void scrollAndSearch(AndroidDriver driver, String text){
		String uiSelector = "new UiSelector().textMatches(\"" + text + "\")";
		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
		driver.findElementByAndroidUIAutomator(command).click();
	
	}
}
