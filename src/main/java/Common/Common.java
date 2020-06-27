package Common;

import org.openqa.selenium.WebElement;

public class Common 
{
	public static void display(WebElement ele)
	{
			if(ele.isDisplayed() && !(ele.getAttribute("text").isEmpty()))
			{
				System.out.println(ele.getText() + " is displayed");
			}
			else if(ele.isDisplayed())
			{
				System.out.println("Element is displayed");
			}
			else
			{
				System.out.println("Element is not displayed");
			}
		 
		
	}
}
