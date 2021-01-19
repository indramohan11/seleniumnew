import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropertiesfileAndGenerateLogs {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace1\\SeleniumPractice\\config.properties");
		prop.load(file);
		Logger log=Logger.getLogger(ReadPropertiesfileAndGenerateLogs.class);
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		String site=prop.getProperty("browser");
		if(site.equals("chrome"))
		{
			driver=new ChromeDriver();
		}else if(site.equals("FF"))
		{
			driver=new SafariDriver();
		}else
		{
			System.out.println("not found");
		}
	driver.get(prop.getProperty("url"));
	log.info("site launched");
	driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	log.info("login button clicked");
	driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
	Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
	Thread.sleep(4000);
	driver.close();
		
		
		

	}

}
