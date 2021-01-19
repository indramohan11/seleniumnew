import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadingUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		String url="http://demo.automationtesting.in/Register.html";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")))
		
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[4]/a"))).click().build().perform();
		Thread.sleep(4000);
		act.click(driver.findElement(By.xpath("//input[@id='input-4']"))).build().perform();
		
		Pattern p1= new Pattern("D:\\selenium testing files\\text.PNG");
		Pattern p2=new Pattern("D:\\selenium testing files\\button.PNG");
		Screen sc=new Screen();
		sc.type(p1, "D:\\ArraysInterviewQuesions.txt");
		sc.click(p2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-default fileinput-upload fileinput-upload-button']")).click();
		Thread.sleep(4000);
		
		driver.close();

	}

}
