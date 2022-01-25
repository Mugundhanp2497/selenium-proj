package normalprog;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionrobot 
{
	public static void main(String[] args) throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
	WebElement t=driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		Actions a=new Actions(driver);
		a.moveToElement(t).perform();
	    a.doubleClick().perform();
		//	a.keyDown(Keys.SPACE).perform();
	//	a.keyUp(Keys.SPACE).perform();
	   driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
				
		
	}

}
