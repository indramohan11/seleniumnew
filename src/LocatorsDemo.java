import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("indramohan98@gmail.com");
//		dr.findElement(By.name("pass")).sendKeys("102305689");
//		dr.findElement(By.cssSelector("#u_0_b")).click();
		dr.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(3000);
	     dr.close();
		
		
	
		
		
		
		
		
		
	}

}
