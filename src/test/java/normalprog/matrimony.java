package normalprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseClass.FullBase;

public class matrimony extends FullBase
{
	@Test
	public void a()
	{
		chromeBrowserOn();
		giveUrl("https://www.bharatmatrimony.in/");
		max();
		wait(30);
	}
	@Test
	public void b() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("H8647191");
		driver.findElement(By.xpath("//input[@value='password']")).sendKeys("test4bm");
		driver.findElement(By.xpath("(//a[@class='login-button'])[1]")).click();
	}
	@Test
	public void c()
	{
	
		
		
	}

}
