package Tests;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(groups="test1")
	public void loginSuccessfull()
	{
		System.out.println("testing Flipkart..");
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Vict@123");
//		driver.findElement(By.xpath("//div[@class=\"_1D1L_j\"]")).click();
//		
//		String inputName="My Account";
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//		driver.navigate().refresh();
//		String name=driver.findElement(By.xpath("//div[text()=\"My Account\"]")).getText();
//		Assert.assertEquals(inputName,name);
		driver.quit();		
	}
	
	@Test(groups="test1")
	public void loginWithWrongPassword()
	{
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("7806873973");
		
		driver.findElement(By.xpath("//button[text()=\"Request OTP\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(By.xpath("//div[@class=\"_1D1L_j\"]")).click();
//		
//		String inputName="My Account";
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//		driver.navigate().refresh();
//		String name=driver.findElement(By.xpath("//div[text()=\"My Account\"]")).getText();
//		Assert.assertEquals(inputName,name);
		driver.quit();		
	}
	
	@Test(groups="test2")
	public void pedgog()
	{
		driver.get("https://uatrailways.pedgog.in/");
		System.out.println(driver.getTitle());
		driver.quit();	
	}
	
	
	public static void main(String args[]) throws MalformedURLException
	{
		URL url=new URL("http://localhost:4444");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setCapability("browserVersion", "108.0.5359.100");
		RemoteWebDriver driver=new RemoteWebDriver(url, chromeOptions);
		System.out.println("Docker testing started..");
		driver.get("https://wikipedia.com");
		System.out.println(driver.getTitle());
		System.out.println("Docker testing done");
		
		
	}
	
	
	
	
}
