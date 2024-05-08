import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		 driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > input[type=password]:nth-child(3)")).sendKeys("hjj");
		 driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > button")).click();
//		
//		 Thread.sleep(5000);
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sanchita");
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sanchitadhole4@gmail.com");
		 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		 driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sanchiz@gmail.com");
		 driver.findElement(By.xpath("//form/input[3]")).sendKeys("840420820503");
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 
		 driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		 Thread.sleep(5000);
		 
		 
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sanchita");
		 driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("rahulshettyacademy");
		 	driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 driver.close();
		 
		 
		 
		
		 
		 
		 
		 

	}

}
