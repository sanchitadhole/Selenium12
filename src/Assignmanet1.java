import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assignmanet1 {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		// Assert checkbox is check
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.cssSelector("input[value='option1']")).isSelected();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		// Assert checkbox is check
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
			}
}
