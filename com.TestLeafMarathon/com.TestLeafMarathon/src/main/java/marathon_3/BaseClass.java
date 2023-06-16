package marathon_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public RemoteWebDriver driver;

	public String filedata;

	
	
//	1. Login to https://login.salesforce.com
	
	
	@Parameters({ "Browser","url", "username", "password"})
	@BeforeMethod
	public void preCondition(String browser,String url, String uname, String pwd) {

		if (browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			
			FirefoxOptions optionsforfirefox = new FirefoxOptions();
			optionsforfirefox.addArguments("--disable-notifications");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(optionsforfirefox);

		}

		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys(uname);

		driver.findElement(By.xpath("(//form[@id='login_form']//div)[4]/following::input[@id='password']"))
				.sendKeys(pwd);

		driver.findElement(By.xpath("//div[@id='pwcaps']/following::input[@id='Login']")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
