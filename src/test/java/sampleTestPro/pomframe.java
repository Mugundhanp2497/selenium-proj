package sampleTestPro;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import baseClass.baseClassPro;
import normalprog.pojo;

public class pomframe extends baseClassPro 
{
	    public static pojo pj;
        @BeforeClass
        public static void sample()
        {
		browserSetup();
		waits(10);
		maximize();
		UrlMeth("https://www.facebook.com/");
        }
      
        @Test
        public void  sample2()
        {
		 pj=new pojo();
		WebElement a=pj.getName();
		pj.pojofind(a, "mugu@water");
		WebElement b=pj.getPasswrd();
		pj.pojofind(b, "asdfghjkl");
        }
        @AfterClass
        public static void sample3()
        {
		WebElement c=pj.getLogin();
		pj.pojoclick(c);
        }
		
	

	

}
