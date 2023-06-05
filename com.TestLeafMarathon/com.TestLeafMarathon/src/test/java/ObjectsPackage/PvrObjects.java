package ObjectsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PvrObjects {
	
	public static WebDriver driver;

	@FindBy(xpath="//div[contains(text(),'Movie Library ')]")
	public static WebElement movieLibrary;
	
	@FindBy(xpath="//select[@name='city']")
	public static WebElement city;
	
	@FindBy(xpath="//select[@name='genre']")
	public static WebElement Genres;
	
	@FindBy(xpath="//select[@name='lang']")
	public static WebElement Language;
	
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	public static WebElement Apply;
	
	@FindBy(xpath="//section[@class='pvr-sec movie-library']/div[1]/div[2]/div[1]")
	public static WebElement firstResultMovie;
	
	@FindBy(xpath="//button[contains(text(),'Proceed To Book')]")
	public static WebElement proceedtoBook;
	
	@FindBy(xpath="//select[@id='cinemaName']")
	public static WebElement Cinema;
	
	@FindBy(xpath="//select[@name='timings']")
	public static WebElement showoTimings;
	
	@FindBy(xpath="//*[@name='name']")
	public static WebElement name;
	
	@FindBy(xpath="//div[@class='datepicker-container datepicker-default']")
	public static WebElement datepicker;
	
	@FindBy(xpath="//*[@name='mobile']")
	public static WebElement mobileNumber;
	
	@FindBy(xpath="//div[@class='main-calendar-days']/span[text()='8']")
	public static WebElement Calendar;
	
	@FindBy(xpath="//*[@name='noOfTickets']")
	public static WebElement noOfSeats;
	
	@FindBy(xpath="//*[@name='email']")
	public static WebElement emailID;
	
	@FindBy(xpath="//select[@name='food']")
	public static WebElement food;
	
	@FindBy(xpath="//span[text()='Copy To Self']")
	public static WebElement CopySelf;
	
	@FindBy(xpath="//*[@name='comment']")
	public static WebElement Otherinfo;
	
	@FindBy(xpath="//button[text()='SEND REQUEST']")
	public static WebElement sendRequest;
	
	@FindBy(xpath="//h2[text()='Success']")
	public static WebElement Success;
	
	@FindBy(xpath="(//button[text()='CANCEL'])[2]")
	public static WebElement CancelButton;
	

}