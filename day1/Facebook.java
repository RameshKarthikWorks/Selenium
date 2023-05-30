package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts (). implicitlyWait (10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dhruv");
		
		driver.findElement(By.name("lastname")).sendKeys("Rakshith");
		
		driver.findElement(By.name("reg_email__")).sendKeys("ramesharavindhkarthi@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ramesharavindhkarthi@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("Riyon1@*123");
		
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selectday = new Select(day);
		
		selectday.selectByValue("30");
		
		Select selectmonth = new Select(month);
		
		selectmonth.selectByVisibleText("Nov");
		
		Select selectyear = new Select(year);
		
		selectyear.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		System.out.println("FaceBook Account is Created !");
		
//		driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
		
		
	}

}
