
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandling {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromenew\\chromedriver.exe");
		// To open browser
		WebDriver driver = new ChromeDriver();
		// To maximize browser
		String baseUrl = "http://demo.automationtesting.in/Register.html";
		driver.manage().window().maximize();
		// To open Naukri website with multiple windows
		driver.get(baseUrl);
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		
		act.moveToElement(element).build().perform();
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		element3.click();
		System.out.println(driver.getTitle());
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		System.out.println(windows);
		
		String[] id=new String[2];
		Iterator<String> it=windows.iterator();
		for(int i=0;i<windows.size();i++)
		{
			id[i]= it.next();
		}
		
			String title=driver.switchTo().window(id[1]).getTitle();
			System.out.println(title);

	}
}