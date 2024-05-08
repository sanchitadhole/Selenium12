import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckDisabledorunabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			 System.out.println("its enabled");
			 Assert.assertTrue(true);
			 
		 }
		 else {
			 Assert.assertTrue(false);
		 }
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
