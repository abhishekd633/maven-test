package TM_Selenium_HRM.TM_Selenium_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Login {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.gecko.driver","C:\\Users\\Abishek\\Desktop\\Selenium\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
     //comment Text Text
     
     
    }

}
