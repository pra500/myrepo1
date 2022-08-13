package pac1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewtttTest {

	WebDriver driver = null;

	@Test
	public void getbrokenlnkTest() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
		Thread.sleep(6000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// To print the total number of links
		System.out.println("Total links are " + links.size());		
		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			verifyLink(url);
		}

	}

	public static void verifyLink(String urlLink) throws IOException {

		try {

			URL link = new URL(urlLink);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
			int respCode = httpConn.getResponseCode();
			if (respCode >= 400) {
				System.out.println(link + " is a broken link");

			} else {
				System.out.println(link + " is not a broken link");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
