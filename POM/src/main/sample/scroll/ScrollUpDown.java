package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;

@Test
public class ScrollUpDown extends GenericWrappers {

	public void scrollUpDwon() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");

		((JavascriptExecutor) driver).executeScript("scroll(0,500)");

		closeBrowser();

	}

}