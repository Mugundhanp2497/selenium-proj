package sampleTestPro;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import baseClass.baseClassPro;

public class testClassPro extends baseClassPro
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		browserSetup();
		waits(10);
		maximize();
		UrlMeth("https://www.facebook.com/");
		findelement("//input[@type='text']","mugu24@gmail.com");
		findelement("//input[@type='password']","mugu320001");
		jsexec("//button[@type='submit']","arguments[0].scrollIntoView(true)");
		findelementClick("//button[@type='submit']");
		screenshot("mugu");
		actions("//div[contains(text(),'that you')]");
		robots();
		
		
		
	}

}
