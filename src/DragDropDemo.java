import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement source=driver.findElement(By.id("box3"));
        WebElement destination=driver.findElement(By.id("box103"));
        Actions act=new Actions(driver);
//        act.clickAndHold(source).moveToElement(destination).release().build().perform();
//        Thread.sleep(4000);
//        driver.close();
        
        act.dragAndDrop(source, destination).build().perform();
        
        
		

	}

}
