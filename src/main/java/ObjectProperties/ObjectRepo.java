package ObjectProperties;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ObjectRepo 
{		
		public static Set<String> productName = new TreeSet<String>();
		@FindBy(id = "com.husqvarna.connect.qa:id/landing_login_btn")
		public static  WebElement loginBtnAppLaunchPage;
		@FindBy(id = "com.husqvarna.connect.qa:id/login_email_edit_text")
		public static WebElement emailId ;
		@FindBy(id ="com.husqvarna.connect.qa:id/login_password_edit_text")
		public static WebElement passward;
		@FindBy(id = "com.husqvarna.connect.qa:id/login_btn")
		public static WebElement loginBtnLoginPage;
		@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
		public static WebElement allowdBtn;
		@FindBy(xpath ="//android.widget.Button[@text='ALLOW']")
		public static WebElement bluetoothAllowdBtn;
		@FindBy(xpath ="//android.widget.Button[@text='DENY']")
		public static WebElement bluetoothDenyBtn;
		@FindBy(id = "com.husqvarna.connect.qa:id/tool_name_txt")
		public static List<WebElement> prodCount;
		@FindBy(id = "com.husqvarna.connect.qa:id/landing_sign_up_btn")
		public static WebElement signupBtn; 
		@FindBy(xpath = "//android.widget.ImageView[@index='0']")
		public static WebElement hqLogo;
		@FindBy(xpath ="//*[@text='HUSQVARNA CONNECT']")
		public static WebElement connectTxtBox;
}
