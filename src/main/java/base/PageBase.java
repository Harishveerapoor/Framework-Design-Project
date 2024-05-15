package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageBase {
public static WebDriver driver;
public static Properties pro;

public PageBase() throws IOException{
			
			Properties pro= new Properties();
			FileInputStream file= new FileInputStream("C:\\Batch22\\Framework_Design\\src\\main\\java\\configuaration\\config.properties");
		    pro.load(file);
	}
   public static WebDriver initialization(String browsname,String url) {
	   if(browsname.equals("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		   driver=new ChromeDriver();
	   }
	   else {
		   System.out.println("we are not supporting this browser");
	   }
         driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get(url);
		return driver;
	   
   }
   public void teardown() {
	   driver.quit();
   }
}


