package testcase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Common {
	
	public void allowAppPermission(AndroidDriver driver){	
		
		 while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		}
}
