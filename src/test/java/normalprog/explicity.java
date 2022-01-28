package normalprog;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicity 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com/");
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(d,30);
		w.until(ExpectedConditions.alertIsPresent());
		FluentWait<WebDriver> t=new FluentWait(d);
		t.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100)).ignoring(Exception.class);
		
	}

}
 