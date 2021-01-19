import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FlashObjectsHandlingUsingSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		String url="https://www.youtube.com/watch?v=NnorCUNmYGo&list=PLv_sM9ZH4RUVu6Pl-jtMJMonhgmqDjsIv&index=20";
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
		driver.manage().window().maximize();
//			Pattern p1= new Pattern("D:\\selenium testing files\\play.png");
			Pattern p2= new Pattern("D:\\selenium testing files\\mute.png");
			Pattern p3= new Pattern("D:\\selenium testing files\\max.png");
			Screen sc=new Screen();
//			sc.click(p1);
			Thread.sleep(3000);
			sc.click(p2);
			Thread.sleep(3000);
			sc.click(p3);
			
			
			
		
		

	}

}
