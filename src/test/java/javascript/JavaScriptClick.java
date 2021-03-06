package javascript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptClick {
    private WebDriver driver;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testJSClick1() throws Exception {
        driver.get("https://courses.letskodeit.com/practice");
        Thread.sleep(3000);

        WebElement checkBoxElement = driver.findElement(By.id("bmwcheck"));
        js.executeScript("arguments[0].click();", checkBoxElement);
    }

    @After
    public void tearDown() throws Exception {
    }
}