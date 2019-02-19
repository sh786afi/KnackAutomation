package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

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
		}
}
