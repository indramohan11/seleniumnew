import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.fb.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().to("https://wynk.in/music/package/international-top-hits/bb_1507201404973");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(4000);
//		driver.navigate().forward();
//		Thread.sleep(4000);
		driver.navigate().refresh();
//		driver.findElement(By.id("email")).sendKeys("indramohan");
//		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("email")).getAttribute("type"));
		Thread.sleep(4000);
//		driver.findElement(By.id("email")).clear();
//		System.out.println(driver.findElement(By.id("email")).getText());
//		System.out.println(driver.findElement(By.name("websubmit")).getSize());
//		System.out.println(driver.findElement(By.cssSelector("#u_0_13 > span:nth-child(1) > label")).isSelected());
////		System.out.println(driver.findElement(By.id("email")).getAttribute(arg0));
//		
//		
		Thread.sleep(4000);
		driver.close();
		
	}
	
		
	}


