package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;


@Test
public class MetdKeyDown {	
	public void xPath() throws InterruptedException
{	SafariDriver driver =new SafariDriver();
		driver.manage().window().maximize();
		
driver.get("http://omayo.blogspot.com/");
        
        WebElement compediumDevLink = driver.findElement(By.linkText("compendiumdev"));
       
        Actions actions = new Actions(driver);
       
        actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		
		

/*
 * import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

		SafariDriver driver =new SafariDriver();
		driver.navigate().to("https://www.codingdojo.com/ ");2R2
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		2R
		/*
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // identify element
      WebElement l = driver.findElement(By.id("search-strings"));
      // Actions class
      Actions a = new Actions(driver);
      // moveToElement() and then click()
      a.moveToElement(l).click();
      //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
      a.keyDown(Keys.SHIFT);
      a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
      driver.quit();
      */
   }
}
