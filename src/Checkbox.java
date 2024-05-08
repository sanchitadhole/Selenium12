
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Thread.sleep(3000);
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 
		 // Count the number of checkboxes
		 System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		 
//		 driver.close();
		 
		 
		 
		 

	}

}
