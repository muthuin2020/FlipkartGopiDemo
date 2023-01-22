package BaseClass;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;

	@BeforeMethod
	public void nameBefore(Method method) {
		File file=new File(System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		System.out.println("Executable ? : "+file.canExecute());
		file.setExecutable(true);
		System.out.println("Executable ? : "+file.canExecute());
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Test name: " + method.getName());
	}

	@AfterMethod
	public void nameAfter(ITestResult result) {
		if (result.getStatus() == 1)

			System.out.println("Test case " + result.getName() + " is Passed");
		else {
			System.out.print("Test case " + result.getName()+" is ");
			System.err.println("Failed");
		}
		driver.quit();

	}

}
