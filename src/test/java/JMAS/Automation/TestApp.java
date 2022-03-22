package JMAS.Automation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApp {
	@Test
	public void runChrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.google.com");
		driver.findElement(By.name("qasd")).sendKeys("dsad");
	}
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("dsad");
	}
}
