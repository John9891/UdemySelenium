package basicweb;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByNameDemo {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);

        driver.findElement(By.name("enter-name")).sendKeys("Automation");
    }
}