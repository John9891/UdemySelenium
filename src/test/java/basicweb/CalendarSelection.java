package basicweb;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelection {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//@Test
	public void test1() throws Exception {
		driver.get(baseUrl);
		// Click flights tab
		driver.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']")).click();
		// Find departing field and click it
		WebElement departingField = driver.findElement(By.id("d1-btn"));
		departingField.click();
		Thread.sleep(3000);
		// Find the departure date to be selected and click it
		WebElement departureDateToSelect = driver.findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='30'])[1]"));
		departureDateToSelect.click();
		// Find the return date to be selected and click it
		WebElement returnDateToSelect = driver.findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='30'])[2]"));
		returnDateToSelect.click();
		// Wait to see the click action before clicking Done button
		Thread.sleep(3000);
		WebElement doneButton = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
		doneButton.click();
	}

	@Test
	public void test2() throws Exception {
		driver.get(baseUrl);
		// Click flights tab
		driver.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']")).click();
		// Find departing field and click it
		WebElement departingField = driver.findElement(By.id("d1-btn"));
		departingField.click();
		Thread.sleep(3000);
		// Find the departure date to be selected and click it
		//WebElement calMonth = driver.findElement(By.xpath("//table[@class='uitk-date-picker-weeks'][1]"));
		List<WebElement> allValidDepartureDates = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]//button[@class='uitk-date-picker-day uitk-new-date-picker-day']"));
		for (WebElement date:allValidDepartureDates) {
			if(date.getAttribute("data-day").equals("29")){
				date.click();
				break;
			}
		}

		// Find the return date to be selected and click it
		List<WebElement> allValidReturnDates = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[2]//button[@class='uitk-date-picker-day uitk-new-date-picker-day']"));
		for (WebElement date:allValidReturnDates) {
			if(date.getAttribute("data-day").equals("10")){
				date.click();
				break;
			}
		}

		// Wait to see the click action before clicking Done button
		Thread.sleep(3000);
		WebElement doneButton = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
		doneButton.click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
}