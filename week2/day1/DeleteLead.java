package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9600579204");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'15905')])[1]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		driver.findElement(By.xpath("(//span[contains(text(),'Name and ID')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15905");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		String display =driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		
		System.out.println(display);
		
		driver.close();
		
		

	}

}
