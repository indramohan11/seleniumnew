import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		
////		Simple alert
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/selenium%20testing%20files/simplealert.html");
////		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
////		Thread.sleep(4000);
////		Alert alert=driver.switchTo().alert();
////		Thread.sleep(4000);
////		System.out.println(alert.getText());
////		alert.accept();
////		Thread.sleep(4000);
////		driver.close();
//		
		
//		confirmation alert
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/selenium%20testing%20files/confirmationalert.html");
//		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
//		Alert alert=driver.switchTo().alert();
//     	Thread.sleep(4000);
//	     System.out.println(alert.getText());
////	     alert.accept();
//	     alert.dismiss();
//	     Thread.sleep(4000);
//	     driver.close();
		
	     
	    	 
	    	 
	    	 System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/selenium%20testing%20files/promptalert.html");
			driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
			Thread.sleep(4000);
			Alert alert=driver.switchTo().alert();
	     	alert.sendKeys("indra");
	     	Thread.sleep(4000);
		     alert.accept();
//		     alert.dismiss();
		     Thread.sleep(4000);
		     driver.close();
		
		
		
	}
}
