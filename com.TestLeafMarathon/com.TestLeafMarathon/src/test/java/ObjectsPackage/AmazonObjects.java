package ObjectsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import marathonTestCase.AmazonTestCase;

public class AmazonObjects extends AmazonTestCase {
	
	
	public AmazonObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,AmazonTestCase.class);
	}
	
	
	@FindBy(xpath="//input[@name='field-keywords']")
	public static WebElement searchTextBox;
	
	@FindBy(xpath="((//div[@id='nav-flyout-searchAjax']/div)[2]/div/child::div[1]/div/div/div/span[contains(text(),' for boys')])[1]")
	public static WebElement listbags;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public static WebElement searchButton;
	
	@FindBy(xpath="(//div[@class='sg-col-inner']/div[1]/span)[1]")
	public static WebElement result;
	
	@FindBy(xpath="//div[@id='brandsRefinements']/ul/span/li/span/a/span[contains(text(),'Zipline')]")
	public static WebElement firstBrand;
	
	@FindBy(xpath="//div[@id='brandsRefinements']/ul/span/li/span/a/span[contains(text(),'Skybags')]")
	public static WebElement SecondBrand;
	
	@FindBy(xpath="((//a[contains(@class,'a-link-normal s-underline-text')]//span)[2]/following::span)[8]")
	public static WebElement titleofFirstProduct;
	
	@FindBy(xpath="(//a[contains(@class,'a-link-normal s-underline-text')]//span)[2]/following::span[21]")
	public static WebElement Discountprice;
	
	@FindBy(xpath="(//a[contains(@class,'a-link-normal s-underline-text')]//span)[2]/following::span[15]")
	public static WebElement actualPrice;
	
	
	


}
