package com.cjc.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cjc.pages.AutomationRegister;
import com.cjc.pages.SignIn;
import com.cjc.utility.Comman;

public class AutoRegg
{
	@Test(priority=1)
	public void verify() throws IOException
	{
		
	WebDriver driver=Comman.openchrome("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	SignIn a=new SignIn(driver);
	a.signin();
	AutomationRegister a1=new AutomationRegister(driver);
	a1.reg();
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	}
}
