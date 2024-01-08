package methods;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodBreakdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		driver = new ChromeDriver(options);
//		options.addArguments("--blink-settings=imagesEnabled=false");
//		driver.manage().window().maximize();
//		driver.get("https://www.tarladalal.com/");
		driverFactory();
		driver.findElement(By.xpath("//*[@title='Recipea A to Z']")).click();
		List<WebElement> alphabets = driver
				.findElements(By.xpath("//*[@id='ctl00_cntleftpanel_mnuAlphabets']//table/tbody/tr/td/a"));
		System.out.println(alphabets.size());
		for (int i = 0; i < 3; i++) {
			alphabets = driver
					.findElements(By.xpath("//*[@id='ctl00_cntleftpanel_mnuAlphabets']//table/tbody/tr/td/a"));
			WebElement alphabet = alphabets.get(i);
			if (!(alphabet.getText().equals("0-9") || alphabet.getText().equals("Misc"))) {
				alphabet = alphabets.get(i);
				System.out.println(alphabet.getText());
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(alphabet));
				alphabet.click();
				// We can do write the below code with in the same main method
				// or we can create seperate method like listofpages();
				// List<WebElement> pages =
				// driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/a"));
				// System.out.println(pages.size());
				listOfPages();
			}
		}
	}

	public static void driverFactory() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		options.addArguments("--blink-settings=imagesEnabled=false");
		driver.manage().window().maximize();
		driver.get("https://www.tarladalal.com/");
	}

	public static void listOfPages() {
		List<WebElement> pages = driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/a"));
		System.out.println(pages.size());
	}

}
