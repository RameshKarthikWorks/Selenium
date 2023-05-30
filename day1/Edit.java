package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts (). implicitlyWait (10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver. findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Company");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashok");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthik");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600579204");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ashokkarthi@gmail.com");

		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Verusche");
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

	}

}
