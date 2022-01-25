package testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.baseClassPro;
import normalprog.pojo;

public class dataprovi extends baseClassPro
{
	@BeforeClass
	public static void start()
	{
		browserSetup();
	    waits(10);
	    maximize();
	}
	@Test(dataProvider="mugu")
	public void data(String user,String pass)
	{
	UrlMeth("https://www.facebook.com/");
	pojo p=new pojo();
	WebElement mail=p.getName();
	mail.sendKeys(user);
	p.getPasswrd().sendKeys(pass);
	p.getLogin().click();
	
	}
	@DataProvider(name="mugu")
	public String[][] datadet()
	{
		return new String[][] {
			{"mugu","mugu@321"},
			{"raju","raju@321"	},
			{ "akash","akash@321"}
			
		};
	}

}
