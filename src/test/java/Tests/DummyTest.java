package Tests;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class DummyTest extends BaseClass{
	
	@Test
	public void amazon()
	{
		driver.get("https://www.wikipedia.com");
		driver.quit();
		
	}
	
	@Test(enabled=true)
	public void mvnrepository()
	{
		driver.get("https://www.flipkart.com");
		//Assert.assertEquals(1, 2);
		driver.quit();
		
	}
}
