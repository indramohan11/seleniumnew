import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int totallinks=allLinks.size();
		System.out.println(totallinks);
		
		for(int i=0;i<totallinks;i++)
		{
			WebElement ele=allLinks.get(i);
			String url=ele.getAttribute("href");
			verify(url);
		
		}
		

	}
	public static void verify(String url) throws IOException
	{
		URL l=new URL(url);
//		HttpConnection httpConnection=(HttpConnection)l.openConnection();
		HttpURLConnection httpConnection=(HttpURLConnection)l.openConnection();
		httpConnection.setConnectTimeout(4000);
		httpConnection.connect();
		if(httpConnection.getResponseCode()==200)
		{
			System.out.println(url+"-----"+httpConnection.getResponseMessage());
		}else
		{
			System.out.println(url+"-----"+httpConnection.getResponseMessage());
		}
		
		
	}

}
