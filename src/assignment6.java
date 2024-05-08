import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String text = driver.findElement(By.xpath("//label[normalize-space()='Option2']")).getText();
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(text)) {
			System.out.println("messge successfully display");
		} else {
			System.out.println("something wrong");
		}
		driver.switchTo().alert().accept();

	}

}
