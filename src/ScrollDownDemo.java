import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDownDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="http://moneyboats.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.quit();
        
        
	}

}
