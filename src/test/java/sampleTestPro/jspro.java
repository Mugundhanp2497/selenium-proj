package sampleTestPro;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import baseClass.baseClassPro;
import normalprog.pojo;

public class jspro extends baseClassPro
{
	@BeforeClass
	public static void sample()
	{
		browserSetup();
		UrlMeth("https://www.facebook.com/");
		waits(10);
		maximize();
		
	}
	@Test
	public void meth1()
	{
		pojo pj=new pojo();
		WebElement a=pj.getName();
		jsproj("arguments[0].setAttribute('value','mugu@654323')",a);
		WebElement b=pj.getPasswrd();
		jsproj("arguments[0].setAttribute('value','987654321')",b);
		
		String p=a.getAttribute("value");
		System.out.println(p);
		Assert.assertTrue(p.startsWith("m"));
		String r=b.getAttribute("value");
		System.out.println(r);
		Assert.assertEquals("ya crt crt", "987654321", r);
		
		WebElement c=pj.getLogin();
		
		jsproj("arguments[0].scrollIntoView(true)",c);
		c.click();
        
		
		jsproj("return arguments[0].getAttribute('value')",a);
		
	}

}
