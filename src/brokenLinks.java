import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		find all links
		List <WebElement>links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a  = new SoftAssert();
		//enhanced for loop
		for(WebElement link:links) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			a.assertTrue(responseCode<403, "The link with Text "+link.getText()+"Is broken with code "+responseCode);
			
			
			
			
			
//			
//			if(responseCode>403) {
//				System.out.println("The link with Text "+link.getText()+"Is broken with code "+responseCode);
//				Assert.assertTrue(false);
//			}
		}
		a.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Broken URL
		// Step 1 - is get all urls tied up to the links using selenium
		// Java methods will call URL's and gets you status code
		// if status code >400 that url is not working. - link broken

		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);
		



	}

}
