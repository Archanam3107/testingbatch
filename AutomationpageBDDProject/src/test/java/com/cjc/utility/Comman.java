package com.cjc.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Comman 
{
	static WebDriver driver;
	   public static  WebDriver openchrome(String browsername,String urlname)
	   {
		   if(browsername.equalsIgnoreCase("chrome"))
		   {   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   
	        }
		   else if(browsername.equalsIgnoreCase("firefox"))
		   {
			   
			   
			   System.setProperty("webdriver.geckodriver.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.26.0-win32.zip\\geckodriver.exe");
			   driver=new FirefoxDriver();
			   
			   
		   }
		   else if(browsername.equalsIgnoreCase("ie"))
		   {
			   
			   
			   System.setProperty("webdriver.geckodriver.driver","C:\\Users\\dell\\Downloads\\IEDriverServer_Win32_3.150.1 (1).zip\\IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
			   
			   
		   }
		   driver.manage().window().maximize();
		   driver.get(urlname);
		   return driver;
		 //  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
}

}
