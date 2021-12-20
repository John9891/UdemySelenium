import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://learn.letskodeit.com";
        driver.get(baseURL);

    }
}