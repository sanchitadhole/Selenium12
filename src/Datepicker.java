import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//			driver.close();
//		 .ui-state-default.ui-state-highlight
		 
			
		 

	}

}
