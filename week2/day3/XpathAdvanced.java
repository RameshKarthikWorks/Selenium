package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvanced {
	
	
//	Launch https://login.salesforce.com/
//		Enter username as hari.radhakrishnan@qeagle.com
//		3.  Enter password as Leaf@1234
//		4.  Click on Login

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("(//form[@id='login_form']//div)[4]/following::input[@id='password']")).sendKeys("Leaf@1234");
		
		driver.findElement(By.xpath("//div[@id='pwcaps']/following::input[@id='Login']")).click();
		
		
//		driver.close();
		
		
	}

}
