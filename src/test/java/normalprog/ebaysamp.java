package normalprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaysamp
{
public static void main(String[] args) throws AWTException {
WebDriverManager.chromedriver().setup();
WebDriver d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
d.get("https://www.bershka.com/");
d.findElement(By.xpath("//button[@aria-label='Cerrar']")).click();
 d.findElement(By.xpath("//button[@type='button']")).click();
 WebElement a=d.findElement(By.xpath("(//li[@role='option'])[92]"));
 a.click();
d.findElement(By.xpath("(//span[@class='country-language-link'])[1]")).click();
d.findElement(By.xpath("//button[@type='submit']")).click();
// d.findElement(By.xpath("//li[@class='gender-wrapper']")).click();
//d.findElement(By.xpath("(//ul[@role='menu'])[4]")).click();
WebElement c=d.findElement(By.xpath("//input[@type='search']"));
JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("arguments[0].setAttribute('value','shirts')", c);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);







}

}