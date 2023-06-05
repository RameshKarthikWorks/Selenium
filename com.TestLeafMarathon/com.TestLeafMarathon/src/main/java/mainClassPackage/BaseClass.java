package mainClassPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	
	public static Properties properties;
	
	
	public Properties config() throws IOException
	{
		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\git\\Selenium\\com.TestLeafMarathon\\com.TestLeafMarathon\\Config\\Config.properties");
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		config();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriverNew\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(properties.getProperty("url1"));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}

}
