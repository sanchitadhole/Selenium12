import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Proxy;


public class moreOptionofSSLCheck {
//extend your browser behaviour options
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("download.default_directory", "/directory/path");


		options.setCapability("proxy", proxy);
		options.setAcceptInsecureCerts(true);     //by default chrome will set all this things.
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
