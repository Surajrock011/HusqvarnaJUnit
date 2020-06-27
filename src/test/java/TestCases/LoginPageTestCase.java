package TestCases;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.springframework.core.annotation.Order;

import Common.Common;
import ObjectProperties.ObjectRepo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class LoginPageTestCase extends ObjectRepo
{	
	public static EnhancedAndroidDriver<MobileElement> driver;
	@Rule
    public TestWatcher watcher = Factory.createWatcher();
	@Before
	public void initialize() throws Exception
	{	
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("appPackage", "com.husqvarna.connect.qa");
		cap.setCapability("appActivity","com.husqvarna.connect.features.SplashScreenActivity");
		driver= Factory.createAndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("Appliation is launched");
		PageFactory.initElements(driver, ObjectRepo.class);
	}
	@Test
	public void Login()
	{	
		Common.display(hqLogo);
		Common.display(connectTxtBox);
		Common.display(signupBtn); 
		loginBtnAppLaunchPage.click();
		emailId.sendKeys("surajrock011@gmail.com");
		passward.sendKeys("123456");
		loginBtnLoginPage.click();
		allowdBtn.click();
		bluetoothDenyBtn.click();
	}
	@Test
	public void productCount() throws Exception
	{	
		Common.display(hqLogo);
		Common.display(connectTxtBox);
		Common.display(signupBtn); 
		loginBtnAppLaunchPage.click();
		emailId.sendKeys("surajrock011@gmail.com");
		passward.sendKeys("123456");
		((AndroidDriver) driver).hideKeyboard();
		loginBtnLoginPage.click();
		allowdBtn.click();
		bluetoothDenyBtn.click();
		Thread.sleep(1000);
		int size=prodCount.size();
		for(int i=0;i<size;i++)
		{	
			productName.add(prodCount.get(i).getText()); 
		}
		driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setMaxSearchSwipes(5).scrollIntoView(new UiSelector().text(\"530iPX\"))"));
		for(int i=0;i<prodCount.size();i++)
		{	
			productName.add(prodCount.get(i).getText()); 
		}
		driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setMaxSearchSwipes(5).scrollIntoView(new UiSelector().text(\"115iHD45\"))"));
		for(int i=0;i<prodCount.size();i++)
		{	
			productName.add(prodCount.get(i).getText()); 
		}
		System.out.println("Number of total Products : "+productName.size()+"\n");
		System.out.println("List of Products");
		System.out.println(productName+"\n");
	}
	@After
    public void TearDown(){
        driver.label("Stopping App");
        driver.quit();
    }
	
}
