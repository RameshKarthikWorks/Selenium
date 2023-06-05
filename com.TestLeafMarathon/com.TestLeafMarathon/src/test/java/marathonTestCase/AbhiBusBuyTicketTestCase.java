package marathonTestCase;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectsPackage.AbhiBusObjects;
import mainClassPackage.BaseClass;

public class AbhiBusBuyTicketTestCase extends BaseClass{
	
	
	@Test(priority=1,enabled = true)
	public void AbhiBusTicketProcess()
	{
		 BuyTicket();
		
	}
	
	
	public void BuyTicket()
	{
		
		
		PageFactory.initElements(driver, AbhiBusObjects.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		boolean selected = AbhiBusObjects.bus.isSelected();
//	
//		System.out.println("The Bus Menu is selected"+ " "+selected);
		
		AbhiBusObjects.From.sendKeys("Chennai");
		
		AbhiBusObjects.fromsuggestionlist.click();
		
		AbhiBusObjects.Destination.sendKeys("Bangalore");
		
		AbhiBusObjects.toSuggestionlist.click();
		
		AbhiBusObjects.calendar.click();
		
		AbhiBusObjects.datepicker.click();
		
		AbhiBusObjects.searchButton.click();
		
		String Bustext = AbhiBusObjects.firstcapturebus.getText();
		
		System.out.println("The Name of the bus is"+ " "+Bustext);
		
		String Seatstext = AbhiBusObjects.avaiableseats.getText();
		
		System.out.println("The Avaiable seats of the bus are"+ " "+ Seatstext);
		
		AbhiBusObjects.Bustypeseater.click();
		
		AbhiBusObjects.selectseatButton.click();
		
		AbhiBusObjects.seatselection.click();
		
		String seatNo = AbhiBusObjects.seatNo.getText();
		
		System.out.println("The Seat No is"+seatNo);
		
		String fare=AbhiBusObjects.totalfare.getText();
		
		System.out.println("The fare for the bus is"+" "+fare);
		
		Select boarding = new Select(AbhiBusObjects.boardingPoint);
		
		boarding.selectByVisibleText("Egmore Parveen Travels (Van/Bus)-15:15");
		
		Select dropping = new Select(AbhiBusObjects.droppingPoint);
		
		dropping.selectByVisibleText("Electronic City Tollgate-22:05");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		

	}

}
