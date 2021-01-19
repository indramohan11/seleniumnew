import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) 
	{
//		//getting the header name
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
//		WebDriver dr=new ChromeDriver();
//		dr.get("https://techcanvass.com/examples/webtable.html");
////		WebElement element=dr.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[1]"));
////		System.out.print(element.getText()+" ");
//		
////		getting particular cell data
//		WebElement e=dr.findElement(By.xpath("//td[contains(text(),'Baleno')]"));
//		System.out.println(e.getText());
//		System.out.println(e.getTagName());
//		dr.close();
//		
		
		
////		getting hole table data
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
//		WebDriver dr=new ChromeDriver();
//		dr.get("https://techcanvass.com/examples/webtable.html");
//		WebElement e=dr.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]"));
//		System.out.println(e.getText()+" ");
//		dr.close();
//		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromenew\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://techcanvass.com/examples/webtable.html");
//		List<WebElement> rows=dr.findElements(By.tagName("tr"));
		WebElement r=dr.findElement(By.xpath("/html/body/table"));
		List<WebElement> columns=r.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println(columns.size());
		dr.close();
		
		
		
		
	}

}
