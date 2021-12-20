package waits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithUtilityDemo {
	private WebDriver driver;
	private String baseUrl;
	WaitTypes wt;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		wt = new WaitTypes(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
	}
	
	@Test()
	public void test() throws Exception {
		driver.get(baseUrl);
		//WebElement loginLink = driver.findElement(By.xpath("//a[@href='/login']"));
		//loginLink.click();
		wt.clickWhenReady(By.xpath("//a[@href='/login']"),3);
		WebElement emailField = wt.waitForElement(By.id("email"), 3);
		emailField.sendKeys("test");
		//driver.findElement(By.id("user_email")).sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
