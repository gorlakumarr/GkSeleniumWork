package selenium_Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {
	@Test
	public void amazoncart() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Nike Shoes");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

		driver.navigate().back();
		System.out.print("Page Title is :" + driver.getTitle());
		driver.get("http://www.facebook.com");

		Thread.sleep(5000);

		driver.quit();
		driver.close();

	}
}
