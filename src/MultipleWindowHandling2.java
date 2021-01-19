import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.naukri.com/";
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		int windowsCount=driver.getWindowHandles().size();
		System.out.println(windowsCount);
		String parentWindow=driver.getWindowHandle();
		String c=driver.switchTo().window(parentWindow).getTitle();
		System.out.println("parent window tilte is"+c);
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		List<String> tabs=new ArrayList();
		
		for(String r:windows)
		{
			tabs.add(r);
		}
		driver.switchTo().window(tabs.get(2)).manage().window().fullscreen();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(4000);
////		for(String child:windows)
////		{
////			if(!parentWindow.equalsIgnoreCase(child))
////			{
////				System.out.println(driver.switchTo().window(child).getTitle());
////				
////			}
////					
////		}
	driver.quit();
//		
//		
//
	}

}
