package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.safari.SafariDriver;

public class SwitchingtoaNewWindowinSeleniumW9D1A3 {
	
public static void main(String[] args) {
	
	SafariDriver driver= new SafariDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND+"n");
	
	try{
		
		Thread.sleep(2000);
		
		for(String winHandle:driver.getWindowHandles()) 
		{
			
			driver.switchTo().window(winHandle);
			
		}
		
		driver.get("https://www.bing.com/");
		
		
	}catch(Exception e) {
		
		System.out.println(e );
		
	  }	
	
    }
	
  }
  
