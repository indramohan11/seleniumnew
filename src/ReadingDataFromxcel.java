import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;

public class ReadingDataFromxcel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		try {
			FileInputStream file=new FileInputStream("D:\\selenium testing files\\Seleniumdata.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFSheet sh=wb.getSheetAt(0);
			int row=sh.getLastRowNum();
			int column=sh.getRow(row).getLastCellNum();
			System.out.println(row);
			sh.getRow(3).getCell(2).getStringCellValue();
			String name=sh.getSheetName();
//			XSSFSheet r=sh.getRow(3).getSheet();
//			CTRow r=sh.getRow(3).getCTRow();
			for(int i=0;i<column;i++)
			{
				String full=sh.getRow(3).getCell(i).toString();
				System.out.print(full+"  ");
			}
		
			
			
//			System.out.print();
//			String data=sh.getRow(2).getCell(2).getStringCellValue();
//			System.out.print(data);
//			
//			for(int i=0;i<=row;i++)
//			{
//				XSSFRow data1=sh.getRow(i);
//				for(int j=0;j<column;j++)
//				{
//					String data2=data1.getCell(j).toString();
//					System.out.print(data2+"  ");
//					
//				}
//				System.out.println();
//			
//		
//				
//			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
