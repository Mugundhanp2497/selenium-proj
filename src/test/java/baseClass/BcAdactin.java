package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Times;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BcAdactin 
{
	public static WebDriver driver;
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public static void waits(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void max()
	{
		driver.manage().window().maximize();
	}
	public static void get(String url)
	{
		driver.get(url);
	}
	public static String xluse(String xlname,String shname,int i,int j,String nr) throws IOException
	{
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\xlFiles\\"+xlname+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet(shname);
		Row rc=s.createRow(3);
		Cell cc=rc.createCell(0);
		Cell cd=rc.createCell(1);
		Cell ce=rc.createCell(2);
		Cell cf=rc.createCell(3);
		Cell cg=rc.createCell(4);
	    cc.setCellValue("Firstmugu");
		cd.setCellValue("lastmugu");
		ce.setCellValue("billling adress ohohoo");
		cf.setCellValue("1234567890123456");
		cg.setCellValue("123");
		Row rd=s.createRow(4);
		Cell ch=rd.createCell(0);
         ch.setCellValue(nr);
	    FileOutputStream fout=new FileOutputStream(f);
	    w.write(fout);
	    System.out.print(nr);
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		String a=c.getStringCellValue();
		return a;
	}
	public static void selectmeth(WebElement wbref,int i)
	{
		Select s=new Select(wbref);
		s.selectByIndex(i);
	}

}
