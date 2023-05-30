package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
ChromeDriver driver1 = new ChromeDriver();
		
driver1.manage().window().maximize();
		
driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
driver1.get("http://leaftaps.com/opentaps/control/login");
		
driver1.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
driver1.findElement(By.id("password")).sendKeys("crmsfa");
		
driver1.findElement(By.className("decorativeSubmit")).click();
		
driver1.findElement(By.linkText("CRM/SFA")).click();
	        
driver1.findElement(By.linkText("Leads")).click();
	        
driver1.findElement(By.linkText("Create Lead")).click();
	    
driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("Disys");
	    
driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");
	    
driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthi");
	    
driver1.findElement(By.name("submitButton")).click();
	    
driver1.findElement(By.linkText("Edit")).click();
	    
	    WebElement ed = driver1.findElement(By.id("updateLeadForm_companyName"));
	    ed.clear();
	    Thread.sleep(2000);
	    ed.sendKeys("Ivy Mobility");
	    
	    driver1.findElement(By.name("submitButton")).click();

	}

}
