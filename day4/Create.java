package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts (). implicitlyWait (10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver. findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Company");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Aravindh");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600579204");

		driver.findElement(By.name("submitButton")).click();

	}

}
