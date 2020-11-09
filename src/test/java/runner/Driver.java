package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Driver {

	public static WebDriver driver;
	

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fagner.joao.f.silva/eclipse-workspace/livelo-automation/src/test/resources/chromedriver/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars", "--disable-gpu", "--window-size=1920,1200",
				"--ignore-certificate-errors", "--disable-notifications", "--disable-popup-blocking","--incognito");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://staging.allya.com.br/empresa");
	}

	
	public static WebDriver getDriver() {
		return driver;
	}
	
	

	@After
	public void cleanCookies() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

	public static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
