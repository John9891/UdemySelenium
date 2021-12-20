import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		// http://selenium-release.storage.googleapis.com/index.html
		
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);
		
	}

}
