package ObjectsPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbhiBusObjects {
	
	
	
	@FindBy(xpath="//a[@id='pills-home-tab']")
	public static WebElement bus;
	
	@FindBy(xpath="//input[@id='source']")
	public static WebElement From;
	
	
	@FindBy(xpath="//input[@id='destination']")
	public static WebElement Destination;
	
	@FindBy(xpath="//ul[@id='ui-id-1']/li[contains(text(),'Chennai')]")
	public static WebElement fromsuggestionlist;
	
	@FindBy(xpath="//ul[@id='ui-id-2']/li[contains(text(),'Bangalore')]")
	public static WebElement toSuggestionlist;
	
	@FindBy(xpath="//*[@id='datepicker1']")
	public static WebElement calendar;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[1]")
	public static WebElement datepicker;
	
	@FindBy(xpath="//input[@id='datepicker2']/following::div/a[text()='Search']")
	public static WebElement searchButton;
	
	@FindBy(xpath="(//div[@class='travele clearfix rSet ng-scope'])[1]/div[2]/div/h2")
	public static WebElement firstcapturebus;
	
	@FindBy(xpath="((//div[@class='travele clearfix rSet ng-scope'])[1]/div[2]/div[2]/div/p)[1]")
	public static WebElement avaiableseats;
	
	@FindBy(xpath="//div[@class='f-bustype-sec']/ul/li[3]")
	public static WebElement Bustypeseater;
	
	@FindBy(xpath="(//a/span[text()='Select Seat'])[1]")
	public static WebElement selectseatButton;
	
	
	@FindBy(xpath="(//div[@class='borderdtd']/div)[1]/div/ul/li/a[@id='UO4-9ZZ']")
	public static WebElement seatselection;
	
	@FindBy(xpath="//div[@class='jurnydetails']/div/p[text()='Seats Selected ']/following::p/span[@id='seatnos']")
	public static WebElement seatNo;
	
	@FindBy(xpath="((//div[@class='jurnydetails']/div)[2]/p)[2]/span[@id='ticketfare']")
	public static WebElement totalfare;
	
	@FindBy(xpath="	//select[@id='boardingpoint_id']")
	public static WebElement boardingPoint;
	
	@FindBy(xpath="//select[@id='droppingpoint_id']")
	public static WebElement droppingPoint;
	


}


