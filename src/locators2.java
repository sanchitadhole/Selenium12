import java.time.Duration;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


import org.testng.Assert;

public class locators2  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Sanchita";
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\edge webdriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		 driver.findElement(By.id("inputUsername")).sendKeys(name);
		 driver.findElement(By.name("inputPassword")).sendKeys(password);
		 Thread.sleep(1000);
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.findElement(By.tagName("p")).getText());
		
	
		 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		 Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+ name+",");
//		 driver.findElement(By.className("logout-btn")).click();
		 driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		 
		 driver.close();
	

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String PasswordText = driver.findElement(By.cssSelector("form p")).getText();
//		 Please use temporary password 'rahulshettyacademy' to Login.
		 String[] passwordArray =   PasswordText.split("'");
//		 0th index = Please use temporary password 
//		 1st index = rahulshettyacademy' to Login.
//		 	String[] passwordArray2 = passwordArray[1].split("'");
		 	
//		 	 0th index = rahulshettyacademy
//		 			 1st index =to Login.
		 	String password =  passwordArray[1].split("'")[0];
		 	
		 	driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		 	Thread.sleep(1000);
		 	return password;
		 
	}

}
