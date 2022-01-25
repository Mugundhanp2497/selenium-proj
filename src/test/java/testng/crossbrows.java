package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrows
{
	public WebDriver d;
	@Parameters("browser")
	@Test
	public void sample(String a) throws AWTException
	{
		if(a.startsWith("c"))
		{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		
		}
		else if(a.startsWith("e"))
		{
			WebDriverManager.edgedriver().setup();
			d=new EdgeDriver();
		}
		else 
		{
			WebDriverManager.firefoxdriver().setup();
			d=new FirefoxDriver();
		}
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
	WebElement t=d.findElement(By.xpath("//a[contains(text(),'New')]"));
		Actions z=new Actions(d);
		z.moveToElement(t).perform();
	    z.doubleClick().perform();
		//	a.keyDown(Keys.SPACE).perform();
	//	a.keyUp(Keys.SPACE).perform();
	   d.findElement(By.xpath("//button[@name='login']")).click();*/

			
		
	}

}
