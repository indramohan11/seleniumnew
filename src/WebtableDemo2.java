import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromenew\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
		dr.manage().window().maximize();
		WebElement e=dr.findElement(By.xpath("/html/body/div/div[3]/div[1]/table"));
		List<WebElement> rows1=e.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr"));
//		List<WebElement> cols=e.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/td"));
//		List<WebElement> rows=e.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr"));
		List<WebElement> columns=e.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th"));
//		System.out.println(e.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/thead")).getText());
//		System.out.println(dr.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[3]/td[4]")).getText());
//		
		System.out.println(columns.size());
		System.out.println(rows1.size());
		
		for(int i=2;i<=rows1.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				System.out.println(dr.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"    ");
			}
		}
		
		
		
		

	}

}
