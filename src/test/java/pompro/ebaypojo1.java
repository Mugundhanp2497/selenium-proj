package pompro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.FullBase;

public class ebaypojo1 extends FullBase
{
	public ebaypojo1()
	{
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({@FindBy(xpath="//select[@class='gh-sb ']"),@FindBy(id="gh-cat")})
	private WebElement allcat;
	
	@CacheLookup
	@FindAll({@FindBy(xpath="//input[@type='text']"),@FindBy(xpath="//input[@placeholder='Search for anything']")})
	private WebElement search;
	
	@CacheLookup
	@FindAll({@FindBy(xpath=("//input[@type='submit']"))})
	private WebElement submit;
	
	
	public static WebElement getAllcat()
	{
		return getAllcat();
	}
	
	public static WebElement getSearch()
	{
		return getSearch();
	}
	
	public static WebElement getSubmit()
	{
		return getSubmit();
	}

}
