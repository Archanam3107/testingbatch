package com.cjc.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationRegister 
{
	public WebDriver driver;
	Properties pro=new Properties();
	public AutomationRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	
  public void reg() throws IOException 
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\dell\\workspace\\selenium workspace\\AutomationpageBDDProject\\src\\test\\java\\com\\cjc\\pages\\Parameter.properties");
	  pro.load(fis);
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	// title radio button
	driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
	//name
	driver.findElement(By.cssSelector("[id='customer_firstname']")).sendKeys(pro.getProperty("name"));
	
	//last name
	driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(pro.getProperty("lastname"));
	
    //password
	driver.findElement(By.cssSelector("#passwd")).sendKeys(pro.getProperty("pass"));
			
	       //date
			WebElement dt=driver.findElement(By.xpath("//select[@id='days']"));
			Select sel=new Select(dt);
			sel.selectByIndex(31);
			
			//month
			WebElement mn=driver.findElement(By.xpath("//select[@id='months']"));
			Select sel1=new Select(mn);
			sel1.selectByIndex(1);
			
			//year
			WebElement yr=driver.findElement(By.xpath("//select[@id='years']"));
			Select sel2=new Select(yr);
			sel2.selectByValue("1994"); 
			
			//chekbox
			driver.findElement(By.xpath("//input[@id='newsletter']")).click();
			driver.findElement(By.xpath("//input[@id='optin']")).click();
			
	        //company
			driver.findElement(By.xpath("//input[@id='company']")).sendKeys(pro.getProperty("Company"));
		  
		    //address
			 //company
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(pro.getProperty("Company1"));
		  
			//city
			driver.findElement(By.id("city")).sendKeys(pro.getProperty("cty"));
			
			//state
			WebElement state=driver.findElement(By.id("id_state"));
			Select sel4=new Select(state);
			sel4.selectByIndex(31);
			
			//pincode
		   driver.findElement(By.id("postcode")).sendKeys(pro.getProperty("pincode"));
			
			//country
					WebElement cn=driver.findElement(By.id("id_country"));
					Select sel5=new Select(cn);
					sel5.selectByValue("21");
					
			//mobile phone
			driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys(pro.getProperty("phone"));	
			//address
			driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(pro.getProperty("add"));
			//register
			driver.findElement(By.xpath("//*[@id='submitAccount']/span")).click();
						
		  
  }

}
