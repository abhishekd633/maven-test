package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HRM_Login {

	@Test
	
	public void login()
	{
     System.setProperty("webdriver.gecko.driver","C:\\Users\\Abishek\\Desktop\\Selenium\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
     //comment Text Text
     
     //twsr
     
     
    }

}
