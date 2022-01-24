package baseClass;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClassPro {
	public static WebDriver driver;
	public static WebElement args;
	
	
	public static void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	public static void UrlMeth(String url)
	{
		driver.get(url);
	}
	public static void waits (int time)
	{
		 driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void pojofind(WebElement ref,String k)
	{
	ref.sendKeys(k);	
	}
	public static void pojoclick(WebElement ref)
	{
		ref.click();
	}
	public static void findelement(String xpathValue,String inputwegive)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(inputwegive);
	}
	public static void findelementClick(String xpathValue)
	{
		driver.findElement(By.xpath(xpathValue)).click();
	}
	
	public static void jsexec(String xpathvalue,String script)
	{
	     args=driver.findElement(By.xpath(xpathvalue));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(script, args);
	}
	public static void jsproj(String agr,WebElement ref)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(agr,ref);
	}
	public static void actions(String xpathvalue)
	{
		args=driver.findElement(By.xpath(xpathvalue));
		Actions a=new Actions(driver);
		a.doubleClick(args);
	}
	public static void robots() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C );
		
	}
	public static void screenshot(String imgName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File k=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\srnshotfl\\"+imgName+".png");
		FileUtils.copyFile(k, f);
		
	}
	
	public static String xluse(File xlname,int x,int y) throws IOException
	{
		String name;
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\xlFiles\\"+xlname+"");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s1=w.getSheet("mugu");
		Row r=s1.getRow(x);
		Cell c=r.getCell(y);
		int a=c.getCellType();
		if(a==1)
		{
			 name=c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c))
		{
			
			SimpleDateFormat s3=new SimpleDateFormat("dd/mm/yyy");
		  Date c4= c.getDateCellValue();
		   name=s3.format(c4);
		}
		else 
		{
			double d3=c.getNumericCellValue();
			long l=(long)d3;
			name=String.valueOf(l);
			
		}
		return name;
		
		
		
	}

}
