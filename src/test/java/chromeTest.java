import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.letskodeit.com";
        driver.get(baseURL);

    }
}
