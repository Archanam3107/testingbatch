package com.cjc.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn
{
	public WebDriver driver;
	Properties pro=new Properties();
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
  public void signin() throws IOException 
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\dell\\workspace\\selenium workspace\\AutomationpageBDDProject\\src\\test\\java\\com\\cjc\\pages\\Parameter.properties");
	  pro.load(fis);
	  //signin
	  driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  //email
	  driver.findElement(By.cssSelector("input#email_create")).sendKeys(pro.getProperty("email"));
	  //create account
	  driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	  
	  }
}