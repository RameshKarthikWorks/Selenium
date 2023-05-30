package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts (). implicitlyWait (10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver. findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Company");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh Aravindh");
		
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select op = new Select (Industry);
		
		op.selectByValue("IND_AEROSPACE");
		
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select op1= new Select (Ownership);
		
		op1.selectByIndex(4);
		
		WebElement cd2 = driver. findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select op2 = new Select (cd2);
		
		op2.selectByVisibleText("Alabama");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}

}
