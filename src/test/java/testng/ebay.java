package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.FullBase;
import pompro.ebaypojo1;

public class ebay extends FullBase
{
	@Test(priority=-1)
	public void start()
	{
	chromeBrowserOn();
	giveUrl("https://www.ebay.com/");
	wait(10);
	max();
	}
	@Test(enabled=false)
	public void sample1()
	{
		ebaypojo1 e=new ebaypojo1();
		WebElement w1=e.getSearch();
		WebElement w2=e.getAllcat();
		WebElement w3=e.getSubmit();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAtttribute('value','iphone')", w1);
		js.executeScript("arguments[[0].click()", w3);
	}
}
