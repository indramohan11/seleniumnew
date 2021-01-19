import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromenew\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");
		d.manage().window().fullscreen();
		d.switchTo().frame("singleframe");

		d.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("indra");
		Thread.sleep(4000);
		
		d.findElement(By.xpath("/html/body/section/div/div/div/input")).clear();
		
		Thread.sleep(4000);
		d.switchTo().defaultContent();

		Thread.sleep(4000);
		d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement elemnt=d.findElement(By.xpath("//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.<')]"));
		d.switchTo().frame(elemnt);
		int count=d.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		WebElement frame1 = d.findElement(By.xpath("/html/body/section/div/div/iframe"));
		d.switchTo().frame(frame1);
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("jaanu");
		
		Thread.sleep(4000);
		d.close();
	}
}
