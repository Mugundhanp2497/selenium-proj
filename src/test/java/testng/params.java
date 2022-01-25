package testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.baseClassPro;
import normalprog.pojo;

public class params extends baseClassPro
{
	@BeforeClass
	public static void start()
	{
		browserSetup();
	    UrlMeth("https://www.facebook.com/");
	    waits(10);
	    maximize();
	}
	@Parameters({"a","b"})
	@Test
	public void data(@Optional("mugu")String user,@Optional("mugu@321")String pass)
	{
	pojo p=new pojo();
	WebElement mail=p.getName();
	mail.sendKeys(user);
	p.getPasswrd().sendKeys(pass);
	p.getLogin().click();
	
	}

}
