package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.FullBase;

public class grouping  extends FullBase
{
	@Test(groups="alph")
	public void a()
	{
		chromeBrowserOn();
		max();
		wait(10);
	}

	@Test(groups="alph")
	public void b()
	{
		giveUrl("https://www.facebook.com");
	}

	@Test(groups="alph")
	public void c()
	{
		findElemXpath("//input[@id='email']","mugu");
	}

	@Test(groups="numeric")
	public void one()
	{
		findElemXpath("//input[@id='pass']","4321");
	}
	@Test(groups="numeric")
	public void two()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}


	
}
