package basicweb;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String baseURL = "https://letskodeit.teachable.com/";
        driver.get(baseURL);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(10000);

        driver.findElement(By.partialLinkText("Forgot")).click();
    }
}