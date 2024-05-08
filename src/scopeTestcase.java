import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopeTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//1. count of link in page
	System.setProperty(
			"webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.count of footer  section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  //limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. only count of first section
		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		
//		4. click on each link in the coloumn and check if the page are opening.
		for(int i=1;i<coloumdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab  = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
	}

}
