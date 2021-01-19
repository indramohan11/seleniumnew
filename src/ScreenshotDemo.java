import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotDemo {
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		takeScreenShot("facebook_home_page");
		
	}
	
	public static void takeScreenShot(String fileName) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Administrator\\eclipse-workspace1\\SeleniumPractice\\pictures"+fileName+".png"));
		
		
	}

}
