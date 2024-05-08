import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(2000);
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2000);
		
		String[] mobileNeeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"}; 

		List<WebElement> MobileName = driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0;i<MobileName.size();i++) {
			
			List mobileNeededList = Arrays.asList(mobileNeeded);
			
			if(mobileNeeded)

			
		
		}

	}

}
