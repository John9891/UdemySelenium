package basicweb;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassDemo1 {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\John Gutierrez\\Dropbox\\2019\\Udemy - Selenium\\Project\\src\\test\\drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        String baseURL = "https://www.facebook.com";
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.className("inputtext")).sendKeys("Automation");
    }
}