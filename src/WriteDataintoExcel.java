

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataintoExcel {
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		FileInputStream src=new FileInputStream("D:\\selenium testing files\\Seleniumdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(src);
		XSSFSheet sh=wb.getSheetAt(0);
		sh.getRow(0).getCell(3).setCellValue("remarks");
		sh.getRow(0).createCell(8).setCellValue("hello");
		FileOutputStream fie=new FileOutputStream("D:\\selenium testing files\\Seleniumdata.xlsx");
		wb.write(fie);
		wb.close();
		
				
		
		
				
	}

}
