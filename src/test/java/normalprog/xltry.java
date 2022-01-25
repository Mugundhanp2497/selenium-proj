package normalprog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class xltry 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\xlFiles\\camdetails.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s=w.getSheet("HD Cameras");
		//Row r=s.getRow(4);
		//Cell c=r.getCell(3);
		//System.out.println(c);
		int rn=s.getPhysicalNumberOfRows();
		for(int i=0;i<rn;i++)
		{
			Row r=s.getRow(i);
			int cn=r.getPhysicalNumberOfCells();
			
		for(int j=0;j<cn;j++)
		{
		
				Cell c=r.getCell(j);
			int a=c.getCellType();
			if(a==1)
			{
			String s1=c.getStringCellValue();
			System.out.println(s1);
			}
			else if(DateUtil.isCellDateFormatted(c))
			{
				Date da=c.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyy");
			sd.format(da);
			
			}
			else
			{
				double dj=c.getNumericCellValue();
				long l1=(long)dj;
				System.out.println(l1);
				String s2=String.valueOf(l1);
				System.out.println(s2);
			}
				//System.out.println(c);
				
		}
		}
		
		
		
	}

}
