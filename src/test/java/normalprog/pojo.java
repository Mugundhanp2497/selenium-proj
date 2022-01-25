package normalprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClassPro;

public class pojo extends baseClassPro
{
	public  pojo()
	{
	   PageFactory.initElements(driver, this);	
	}

	@CacheLookup
	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement name;
	
	@CacheLookup
	@FindAll({@FindBy(id="pass"),@FindBy(name="pass")})
	private WebElement passwrd;
	
	@FindAll({@FindBy(id="u_0_d_RV"),@FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
	private WebElement login;
	
	public WebElement getName()
	{
		return name;
	}
	public WebElement getPasswrd()
	{
		return passwrd;
	}
	public WebElement getLogin()
	{
		return login;
	}
}
