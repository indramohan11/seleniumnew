import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\fb.com");
		driver.manage().window().maximize();
		System.out.print(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		
		


	}

}