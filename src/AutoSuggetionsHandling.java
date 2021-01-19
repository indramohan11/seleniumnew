import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionsHandling {

	public static void main(String[] args) throws AWTException 
	{
		String url="https://www.google.co.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Robot rob=new Robot();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> elemnts=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (WebElement webElement : elemnts) {
//			System.out.println(webElement.getText());
			if(webElement.getText().equals("selenium ide")) {
			
				webElement.click();
				break;
			}
			
		}
	}

}
