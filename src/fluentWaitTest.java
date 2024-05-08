import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/dynamic_loading']")).click();
		driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		
		
		
		
		 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
		    	   return driver.findElement(By.cssSelector("div[id='finish'] h4"));
		       }else
		       {
		    	   return null;
		       }
		       
		       
		       
		       
		       
		     }
		   });
		 System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
		 

		
		
		
		
	}

}
