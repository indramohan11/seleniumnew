import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseEvents {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.automationtesting.in/Register.html";
		String url="https://swisnl.github.io/jQuery-contextMenu/demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
//                driver.get(baseUrl);
                driver.get(url);
                driver.manage().window().maximize();
                Actions act=new Actions(driver);
//               WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
//               WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
//               WebElement element3=driver.findElement(By.xpath("//a[contains(text(),'Static')]"));
//               act.moveToElement(element1).moveToElement(element2).moveToElement(element3).click().build().perform();
//               Thread.sleep(3000);
//               driver.close();
                
                act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
                driver.findElement(By.xpath("/html/body/ul/li[5]/span")).click();
                Alert alert=driver.switchTo().alert();
               System.out.println( alert.getText());
                alert.accept();
               
                
               

               

               
        }
}
