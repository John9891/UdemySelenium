package browserprofile;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:/Users/John Gutierrez/AppData/Local/Google/Chrome/User Data/Default/Extensions/jlhmfgmfgeifomenelglieieghnjghma/1.16.0_0.crx"));
		driver = new ChromeDriver(options);
		driver.get(baseURL);
	}
}