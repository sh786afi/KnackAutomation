package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestCase {
	public void plusMentuTest(AndroidDriver driver) throws IOException, InterruptedException {
		Common com=new Common();
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src/test/java/com/objectrepository/demo/application.properties");
		obj.load(objfile);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addClient"))).click();
		Thread.sleep(1000);
		com.allowAppPermission(driver);
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath(obj.getProperty("backButtonAddClient"))).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addSubscriprtion"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("backButtonSubscription"))).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addBooking"))).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath(obj.getProperty("backButtonBook"))).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addPayment"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("backButtonPayment"))).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addExpense"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("backButtonExpense"))).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("cancelMenu"))).click();
		}
	public void addClientManual(AndroidDriver driver) throws IOException, InterruptedException {
		Common com=new Common();
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src/test/java/com/objectrepository/demo/application.properties");
		obj.load(objfile);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addClient"))).click();
		Thread.sleep(1000);
		com.allowAppPermission(driver);
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addManually"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("enterClientName"))).sendKeys("Shafi");
		driver.findElement(MobileBy.xpath(obj.getProperty("enterClientNumber"))).sendKeys("1256568745");
		driver.findElement(MobileBy.xpath(obj.getProperty("enterClientEmail"))).sendKeys("abc@mail.com");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("doneAddClient"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("nowGreatGoing"))).click();
	}
	public void addClientPhone(AndroidDriver driver) throws IOException, InterruptedException {
		Common com=new Common();
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src/test/java/com/objectrepository/demo/application.properties");
		obj.load(objfile);
		driver.findElement(MobileBy.xpath(obj.getProperty("plusMenu"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addClient"))).click();
		Thread.sleep(1000);
		com.allowAppPermission(driver);
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("addPhonebook"))).click();
		Thread.sleep(1000);
		com.scrollAndSearch(driver, "Select");
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("donePhonebook"))).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath(obj.getProperty("laterGreatGoing"))).click();
	}
}
