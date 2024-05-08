import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Sanchita");
		 driver.findElement(By.name("email")).sendKeys("dholesanchita9@gmail.com");
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("32");
		 driver.findElement(By.id("exampleCheck1")).click();	 
		 WebElement staticdropdown  = driver.findElement(By.id("exampleFormControlSelect1"));
		 Select dropdown = new Select(staticdropdown);
		 dropdown.getFirstSelectedOption();
		 Thread.sleep(2000);
		 driver.findElement(By.id("inlineRadio2")).click();
		 driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12122000");
		 driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		 driver.close();

	}

}






//
//import org.openqa.selenium.Keys;
//
//
//
//
//
//
//
//import org.openqa.selenium.WebDriver;
//






//import org.openqa.selenium.WebElement;
//
//
//
//
//
//
//
//import org.openqa.selenium.chrome.ChromeDriver;






//
//import org.openqa.selenium.support.ui.Select;
//
//
//
//
//
//
//
//public class Assignment {
//
//
//
//
//
//
//
//public static void main(String[] args) {
//






// TODO Auto-generated method stub







//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");


//
//WebDriver driver=new ChromeDriver();
//
//
//
//
//
//driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//driver.findElement(By.name("name")).sendKeys("rahul");
//
//driver.findElement(By.name("email")).sendKeys("hello@abc.com");
//
//driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
//
//driver.findElement(By.id("exampleCheck1")).click();
//
//WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//
//Select abc = new Select(dropdown);
//
//abc.selectByVisibleText("Female");
//
//driver.findElement(By.id("inlineRadio1")).click();
//
//driver.findElement(By.name("bday")).sendKeys("02/02/1992");
//
//driver.findElement(By.cssSelector(".btn-success")).click();
//
//System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
//
//
//
//}

