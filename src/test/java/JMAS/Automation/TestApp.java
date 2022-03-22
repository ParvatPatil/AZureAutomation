package JMAS.Automation;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApp {
	@Test
	public void runChrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.google.com");
	}
}
