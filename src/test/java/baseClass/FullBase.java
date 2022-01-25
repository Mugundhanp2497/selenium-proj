package baseClass;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullBase 
{

	public static WebDriver driver;

	public static void chromeBrowserOn()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void firefoxBrowserOn()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	public static void edgeBrowserOn()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}

	public static void giveUrl(String a)
	{
	  
		driver.get(a);
		String title=driver.getTitle();	
		System.out.println(title);
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		System.identityHashCode(curl);
	}
	public static void max()
	{
		driver.manage().window().maximize();
	}
	public static void wait(int b)
	{
		 driver.manage().timeouts().implicitlyWait(b,TimeUnit.SECONDS);	
	}
	public static void findElemXpath(String Xpath,String val)
	{
		WebElement a=driver.findElement(By.xpath(Xpath));
		a.sendKeys(val);
	}
	public static void action(WebElement wb,WebElement wbc)
	{
		Actions a=new Actions(driver);
		a.moveToElement(wb);
		a.keyDown(Keys.PAGE_DOWN);
		a.keyUp(Keys.PAGE_DOWN);
		a.keyDown(Keys.TAB);
		a.keyUp(Keys.TAB);
		a.doubleClick();
		a.contextClick();
		a.dragAndDrop(wb, wbc);
	}
	public static void robot() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
	}
	public static void alert()
	{
	  Alert a=driver.switchTo().alert();
	  a.accept();
	  a.dismiss();
	  a.sendKeys("Welcome");
	  a.getText();
	}
	public static void javascrexe(WebElement wb)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','mugu')", wb);
		js.executeScript("return argument[0].getAttribute('value')", wb);
		js.executeScript("arguments[0].scrollIntoView(true)",wb);
	}
	public static void scrnshot(String loc) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File f=new File(loc);
	    File a=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(a, f);
	       
	}
	public static void frame(String frameref)
	{
		WebElement wb=driver.findElement(By.xpath(frameref));
		driver.switchTo().frame(wb);
		//to come out of the frame 
		driver.switchTo().parentFrame();
		//to come main
		driver.switchTo().defaultContent();
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());
		System.out.println(wb.isSelected());
	}
	public static void select(WebElement wb)
	{
		Select s=new Select(wb);
		s.isMultiple();
		s.selectByValue(null);
		s.selectByIndex(0);
		s.selectByVisibleText(null);
		List<WebElement> lw=s.getAllSelectedOptions();
	    WebElement a=s.getFirstSelectedOption();
	    List<WebElement> allopt=s.getOptions();
	    s.deselectByValue(null);
		
	}
	public static void windowhan()
	{
		String a=driver.getWindowHandle();
		Set<String> b=driver.getWindowHandles();
		driver.switchTo().window(a);
		
	}
	public static void table(String xp)
	{
	WebElement a=driver.findElement(By.xpath(xp));
    List<WebElement> b=a.findElements(By.tagName("tr"));
    WebElement c=b.get(2);
   List<WebElement> d= c.findElements(By.tagName("th"));
   WebElement e=d.get(3);
   e.getText();
	}
	public static void navigate()
	{
		driver.navigate().to("url");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
	}
	public static void css()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement a=driver.findElement(By.xpath(null));
		a.getCssValue("font-size");
		js.executeScript("arguments[0].setAttribute('style','color:red;font-size=50px')", a);
		
	}
	public static void date()
	{
		Date d=new Date();
		System.out.println(d);
	}
	public static String readxl(String loc) throws IOException
	{
		File f=new File(loc);
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("Sheet name 2");
		Row r=s.getRow(2);
		Cell c=r.getCell(2);
		int x=c.getCellType();
		if(x==1)
		{
			String y=c.getStringCellValue();
			System.out.println(y);
			return y;
		}
		else if(DateUtil.isCellDateFormatted(c))
		{
			Date d=c.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
			String sr=sd.format(d);
			return sr;
		}
		else
		{
			double dr=c.getNumericCellValue();
			long l=(long)dr;
			String ss=String.valueOf(l);
			return ss;
		}
	}
	public static void createxl(String loc) throws IOException
	{
		File f=new File(loc);
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("sheet name 1");
		Row r1=s.createRow(0);
		Row r2=s.createRow(1);
		Cell c1=r1.createCell(0);
		Cell c2=r1.createCell(1);
		Cell c3=r1.createCell(2);
		Cell c4=r2.createCell(0);
		Cell c5=r2.createCell(1);
		Cell c6=r2.createCell(2);
		c1.setCellValue("muugu");
		c2.setCellValue("raju");
		c3.setCellValue("siva");
		c4.setCellValue("prasanth");
		c5.setCellValue("akash");
		c6.setCellValue("gold");
		FileOutputStream fr= new FileOutputStream(f);
		w.write(fr);
		
		
	}
	
}
