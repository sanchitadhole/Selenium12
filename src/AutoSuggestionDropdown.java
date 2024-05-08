import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("india");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		for (WebElement option : options) {
			
			if (option.getText() == "India") {
				option.click();
				break;
			}
		}

		
//		 driver.close();

	}

}
