package com.cjc.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cjc.pages.SignIn;
import com.cjc.utility.Comman;

public class AtSignin 
{
	@Test(priority=1)
	public void verify() throws IOException
	{
		
	WebDriver driver=Comman.openchrome("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	SignIn a=new SignIn(driver);
	System.out.println("hello..SignIn completed");
	a.signin();
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	

}
}