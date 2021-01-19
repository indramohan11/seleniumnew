import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
//			driver.get("http://demo.guru99.com/test/newtours/register.php");
			driver.get("http://output.jsbin.com/osebed/2");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			 Select drop=new Select(driver.findElement(By.id("fruits")));
			 
//			 drop.selectByIndex(4);
//			 drop.selectByValue("INDIA");
//			 drop.selectByVisibleText("Apple");
//			 drop.selectByVisibleText("Grape");
			 drop.selectByIndex(1);
			 drop.selectByIndex(2);
			 Thread.sleep(4000);
			 drop.deselectByIndex(1);
			 Thread.sleep(4000);
			 drop.deselectByIndex(2);
			 Thread.sleep(5000);
			 driver.close();
		

	}

}
