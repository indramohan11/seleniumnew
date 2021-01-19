import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadingUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().fullscreen();
//		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'More')]"));
//	
//		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
//		
//		WebElement element3=driver.findElement(By.xpath("//input[@id='input-4']"));
//		
		Actions act=new Actions(driver);
		
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")))
		
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[4]/a"))).click().build().perform();
		Thread.sleep(4000);
		act.click(driver.findElement(By.xpath("//input[@id='input-4']"))).build().perform();
		
		Robot rob=new Robot();
		
		StringSelection sec=new StringSelection("D:\\ArraysInterviewQuesions.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sec, null);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		Thread.sleep(4000);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		
//		driver.close();
		
		
		
		
		

	}

}
