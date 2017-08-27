package listenersDemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersDemo.TestNgListener.class)

public class MyFIrst {

	@Test
	public void tc01() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.google.com");
		System.out.println(webDriver.getTitle());
		webDriver.quit();

	}

	@Test
	public void tc02() {

		System.out.println("tc 02");
		Assert.assertTrue(false);
	}

}
