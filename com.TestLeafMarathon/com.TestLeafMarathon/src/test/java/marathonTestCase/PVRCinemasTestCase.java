package marathonTestCase;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectsPackage.PvrObjects;
import mainClassPackage.BaseClass;

public class PVRCinemasTestCase extends BaseClass {

	
	@Test(priority=3,enabled = false)
	public void pvrticket() throws InterruptedException
	{
		PageFactory.initElements(driver, PvrObjects.class);
		
		ticketprocesss();
	}
	
	
	public void ticketprocesss() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PvrObjects.movieLibrary.click();
		
		Select city = new Select(PvrObjects.city);
		
		city.selectByValue("Chennai");
		
		Thread.sleep(3000);
		
		Select Gener = new Select(PvrObjects.Genres);
		
		Gener.selectByVisibleText("ANIMATION");
		
		Select Language = new Select(PvrObjects.Language);
		
		Language.selectByVisibleText("ENGLISH");
		
		PvrObjects.Apply.click();
		
		Thread.sleep(5000);
		
		PvrObjects.firstResultMovie.click();
		
		PvrObjects.proceedtoBook.click();
		
		Select cinema = new Select(PvrObjects.Cinema);
		
		cinema.selectByVisibleText("SPI Sathyam Chennai");;
		
		Select ShowTime = new Select(PvrObjects.showoTimings);
		
		ShowTime.selectByIndex(2);
		
		PvrObjects.name.sendKeys("Ramesh Aravindh");
		
		PvrObjects.mobileNumber.sendKeys("9600579204");
		
		PvrObjects.emailID.sendKeys("ramesharavindh@gmail.com");
		
		PvrObjects.datepicker.click();
		
		PvrObjects.Calendar.click();
		
		PvrObjects.noOfSeats.sendKeys("3");
		
		PvrObjects.Otherinfo.sendKeys("Testing");
		
		Select food = new Select(PvrObjects.food);
		
		food.selectByVisibleText("Yes");
		
		PvrObjects.CopySelf.click();
		
		PvrObjects.sendRequest.click();
		
		Thread.sleep(5000);
		
		String text = PvrObjects.Success.getText();
		
		System.out.println(text);
		
		PvrObjects.CancelButton.click();
		
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is "+ " "+title);
		

		
	}
}
